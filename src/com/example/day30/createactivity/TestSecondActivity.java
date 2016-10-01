package com.example.day30.createactivity;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class TestSecondActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b1_second);
		findViewById(R.id.b1_second).setOnClickListener(this);
		
		//获取到启动这个Activity的意图
		Intent intent = getIntent();
		Uri uri =intent.getData();
		Log.d("SecondActivity", uri.toString());
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1_second:
			
			break;

		default:
			break;
		}
	}

}
