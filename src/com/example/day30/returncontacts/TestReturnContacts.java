package com.example.day30.returncontacts;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;

public class TestReturnContacts extends Activity implements OnClickListener {
	EditText et_contacts;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b7_returncontacts);
		findViewById(R.id.b6_add).setOnClickListener(this);
		et_contacts= (EditText) findViewById(R.id.b6_contacts);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b6_add:
			//告诉系统这个Intent要返回数据
			Intent intent =new Intent(TestReturnContacts.this, TestContacts.class);
			startActivityForResult(intent, 10);
			break;

		default:
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		//请求码和结果码
		if(resultCode==0){
			et_contacts.setText(data.getStringExtra("name"));
		}
	}

}
