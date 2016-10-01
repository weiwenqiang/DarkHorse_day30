package com.example.day30.dataintent;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TextIntent extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b3_dataintent);
		findViewById(R.id.b3_data1).setOnClickListener(this);
		findViewById(R.id.b3_data2).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b3_data1:
			startActivity(new Intent(TextIntent.this, TextIntentPutExtra.class));
			break;
		case R.id.b3_data2:
			startActivity(new Intent(TextIntent.this, TextIntentBundleData.class));
			break;
		default:
			break;
		}
	}

}
