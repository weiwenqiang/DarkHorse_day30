package com.example.day30.launchmode;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TestLaunchModeOne extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mode_one);
		findViewById(R.id.one_mainactivity).setOnClickListener(this);
		findViewById(R.id.one_oneactivity).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.one_mainactivity:
			startActivity(new Intent(TestLaunchModeOne.this, TestLaunchMode.class));
			break;
		case R.id.one_oneactivity:
			startActivity(new Intent(TestLaunchModeOne.this, TestLaunchModeOne.class));
			break;
		default:
			break;
		}
	}
}
