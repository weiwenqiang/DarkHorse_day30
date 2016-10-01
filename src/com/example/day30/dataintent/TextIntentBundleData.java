package com.example.day30.dataintent;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;

public class TextIntentBundleData extends Activity implements OnClickListener {
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
			//用Bundle对象封装数据传送
			Bundle bundle = new Bundle();
			bundle.putString("boy", boyName);
			bundle.putString("girl", girlName);
			//把Bundle装入意图
			Intent intent = new Intent();
			intent.setClass(this, TextIntentBundie.class);
			intent.putExtras(bundle);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
}
