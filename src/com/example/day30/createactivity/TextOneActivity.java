package com.example.day30.createactivity;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TextOneActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b1_one);
		findViewById(R.id.b1_one).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1_one:
			Intent intent = new Intent();
			intent.setClass(this, TestSecondActivity.class);
			intent.setData(Uri.parse("test.scheme2:herhgg"));
			startActivity(intent);
			break;

		default:
			break;
		}
	}

}
