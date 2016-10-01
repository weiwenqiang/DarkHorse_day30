package com.example.day30.period;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class TestActivityPeriod extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TestActivityPeriod", "onCreate-----����");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b4_activityperiod);
		TextView dialog = (TextView) findViewById(R.id.b4_activityperiod);
		dialog.setOnClickListener(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("TestActivityPeriod", "onStart-----����");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("TestActivityPeriod", "onResume-----�ɽ���");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("TestActivityPeriod", "onPause-----��ͣʧȥ����");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("TestActivityPeriod", "onStop-----�رղ��ɼ�");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("TestActivityPeriod", "onDestroy-----����");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("TestActivityPeriod", "onRestart-----��������");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b4_activityperiod:
			startActivity(new Intent(TestActivityPeriod.this, PeriodDialog.class));
			break;

		default:
			break;
		}
	}

}
