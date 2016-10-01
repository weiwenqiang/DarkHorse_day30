package com.example.day30.cut;

import com.example.day30.R;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class TestCutHV extends Activity {
	int hp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TestActivityPeriod", "onCreate-----����");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b4_activityperiod);
		//������Ļ�����嵥�б������������������ú����������е���Ч
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		hp = 1000;
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

}
