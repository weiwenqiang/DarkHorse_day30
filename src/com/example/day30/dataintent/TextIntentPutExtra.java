package com.example.day30.dataintent;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;

public class TextIntentPutExtra extends Activity implements OnClickListener {
	EditText ed_boy, ed_girl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.intent_data);
		findViewById(R.id.data_submit).setOnClickListener(this);
		ed_boy = (EditText) findViewById(R.id.data_boy);
		ed_girl = (EditText) findViewById(R.id.data_girl);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.data_submit:
			String boyName = ed_boy.getText().toString();
			String girlName = ed_girl.getText().toString();
			Intent intent = new Intent();
			intent.setClass(this, TextIntentSubmit.class);
			intent.putExtra("boy", boyName);
			intent.putExtra("girl", girlName);
			startActivity(intent);
			break;

		default:
			break;
		}
	}

}
