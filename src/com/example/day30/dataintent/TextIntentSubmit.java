package com.example.day30.dataintent;

import java.util.Random;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class TextIntentSubmit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.intent_data_submit);
		TextView submit = (TextView) findViewById(R.id.intent_submit);

		Intent intent = getIntent();
		String boy = intent.getStringExtra("boy");
		String girl = intent.getStringExtra("girl");

		Random rd = new Random();
		int yinyuan = rd.nextInt(100);

		if ("wwq".equals(boy) && "hlj".equals(girl)) {
			yinyuan = 199;
		}
		submit.setText(boy + "和" + girl + "的姻缘值为" + yinyuan);
	}

}
