package com.example.day30;

import com.example.day30.createactivity.TestIntentActivity;
import com.example.day30.createactivity.TextOneActivity;
import com.example.day30.cut.TestCutHV;
import com.example.day30.dataintent.TextIntent;
import com.example.day30.launchmode.TestLaunchMode;
import com.example.day30.period.TestActivityPeriod;
import com.example.day30.returncontacts.TestReturnContacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		findViewById(R.id.day30_b1).setOnClickListener(this);
		findViewById(R.id.day30_b2).setOnClickListener(this);
		findViewById(R.id.day30_b3).setOnClickListener(this);
		findViewById(R.id.day30_b4).setOnClickListener(this);
		findViewById(R.id.day30_b5).setOnClickListener(this);
		findViewById(R.id.day30_b6).setOnClickListener(this);
		findViewById(R.id.day30_b7).setOnClickListener(this);
		findViewById(R.id.day30_b8).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.day30_b1:
			startActivity(new Intent(MainActivity.this, TextOneActivity.class));
			break;
		case R.id.day30_b2:
			startActivity(new Intent(MainActivity.this, TestIntentActivity.class));
			break;
		case R.id.day30_b3:
			startActivity(new Intent(MainActivity.this, TextIntent.class));
			break;
		case R.id.day30_b4:
			startActivity(new Intent(MainActivity.this, TestActivityPeriod.class));
			break;
		case R.id.day30_b5:
			startActivity(new Intent(MainActivity.this, TestLaunchMode.class));
			break;
		case R.id.day30_b6:
			startActivity(new Intent(MainActivity.this, TestCutHV.class));
			break;
		case R.id.day30_b7:
			startActivity(new Intent(MainActivity.this, TestReturnContacts.class));
			break;
		case R.id.day30_b8:
			break;
		default:
			break;
		}
	}
}
