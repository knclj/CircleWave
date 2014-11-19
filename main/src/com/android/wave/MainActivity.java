package com.android.wave;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends Activity {

	private SeekBar seekBar;
	private WaveView waveView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		seekBar = (SeekBar) findViewById(R.id.seek_bar);
		waveView = (WaveView) findViewById(R.id.wave_view);
		seekBar.setMax(100);
		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				waveView.setProgress(  progress /100f );
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});
	}
}