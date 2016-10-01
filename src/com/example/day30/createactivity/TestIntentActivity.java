package com.example.day30.createactivity;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TestIntentActivity extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b2_intentactivity);
		findViewById(R.id.intent_b1).setOnClickListener(this);
		findViewById(R.id.intent_b2).setOnClickListener(this);
		findViewById(R.id.intent_b3).setOnClickListener(this);
		findViewById(R.id.intent_b4).setOnClickListener(this);
		findViewById(R.id.intent_b5).setOnClickListener(this);
		findViewById(R.id.intent_b6).setOnClickListener(this);
		findViewById(R.id.intent_b7).setOnClickListener(this);
		findViewById(R.id.intent_b8).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.intent_b1:
			// ��ʽ��ͼ
			Intent intent1 = new Intent();
			intent1.setAction(Intent.ACTION_CALL);
			intent1.setData(Uri.parse("tel:110"));// 911�ر����
			startActivity(intent1);
			break;
		case R.id.intent_b2:
			// ��ʾ��ת�绰
			Intent intent2 = new Intent();
			intent2.setClassName("com.android.contacts",
					"com.android.contacts.activities.DialtactsActivity");
			startActivity(intent2);
			break;
		case R.id.intent_b3:
			// ��ʾ��ת�绰
			Intent intent3 = new Intent();
			intent3.setAction(Intent.ACTION_DIAL);
			startActivity(intent3);
			break;
		case R.id.intent_b4:
			// ��ʽ�Զ���
			Intent intent4 = new Intent();
			intent4.setAction("test.action.second2");
			intent4.setData(Uri.parse("test.scheme2:abc"));
			intent4.addCategory(Intent.CATEGORY_DEFAULT);
			startActivity(intent4);
			break;
		case R.id.intent_b5:
			// ��ʽ�Զ���
			Intent intent5 = new Intent();
			intent5.setAction("test.action.second2.one");
			intent5.setData(Uri.parse("test.scheme2.two:qwer"));
			intent5.addCategory(Intent.CATEGORY_DEFAULT);
			startActivity(intent5);
			break;
		case R.id.intent_b6:
			// ��ʽ�Զ���
			Intent intent6 = new Intent();
			intent6.setAction("test.action.second");
			// intent6.setData(Uri.parse("test.scheme:abc"));
			// intent6.setType("text/username");
			// ��������set���ܹ��棬��һ�������ǰһ��������������һ�����õķ���
			intent6.setDataAndType(Uri.parse("test.scheme:abc"),
					"text/username");
			intent6.addCategory(Intent.CATEGORY_DEFAULT);
			startActivity(intent6);
			break;
		case R.id.intent_b7:
			Intent intent7 = new Intent();
			intent7.setClassName("com.android.browser",
					"com.android.browser.BrowserActivity");
			startActivity(intent7);
			break;
		case R.id.intent_b8:
			Intent intent8 = new Intent();
			intent8.setAction(Intent.ACTION_VIEW);
			intent8.setData(Uri.parse("http://www.baidu.com"));
			startActivity(intent8);
		default:
			break;
		}
	}
}
