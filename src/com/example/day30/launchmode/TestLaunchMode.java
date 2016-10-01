package com.example.day30.launchmode;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TestLaunchMode extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b5_launchmode);
		findViewById(R.id.b5_mainactivity).setOnClickListener(this);
		findViewById(R.id.b5_oneactivity).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b5_mainactivity:
			startActivity(new Intent(TestLaunchMode.this, TestLaunchMode.class));
			break;
		case R.id.b5_oneactivity:
			startActivity(new Intent(TestLaunchMode.this, TestLaunchModeOne.class));
			break;
		default:
			break;
		}
	}

}
