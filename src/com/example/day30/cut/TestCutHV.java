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
		Log.d("TestActivityPeriod", "onCreate-----创建");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b4_activityperiod);
		//设置屏幕方向，清单列表配置竖屏，这里设置横屏，后运行的生效
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		hp = 1000;
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("TestActivityPeriod", "onStart-----开启");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("TestActivityPeriod", "onResume-----可交互");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("TestActivityPeriod", "onPause-----暂停失去焦点");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("TestActivityPeriod", "onStop-----关闭不可见");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("TestActivityPeriod", "onDestroy-----销毁");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("TestActivityPeriod", "onRestart-----重新启动");
	}

}
