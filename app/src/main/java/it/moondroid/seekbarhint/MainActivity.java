package it.moondroid.seekbarhint;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

import it.moondroid.seekbarhint.R;

public class MainActivity extends Activity implements SeekBarHint.OnSeekBarHintProgressChangeListener {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBarHint seekBar = (SeekBarHint) findViewById(R.id.seekbar);

        text = (TextView) findViewById(R.id.text);
        text.setText(String.valueOf(seekBar.getProgress()));

        seekBar.setHintView(text);
        seekBar.setOnProgressChangeListener(this);
    }


    @Override
    public void onProgressChanged(SeekBarHint seekBarHint, int progress) {
        text.setText(String.valueOf(progress));
    }
}
