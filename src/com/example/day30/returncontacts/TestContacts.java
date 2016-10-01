package com.example.day30.returncontacts;

import com.example.day30.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TestContacts extends Activity {
	ListView listView;
	private String[] contacts;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.contacts_listview);
		listView = (ListView) findViewById(R.id.contacts_listview);
		
		contacts = new String[] {"路飞","索隆","山治","娜美","乌索普"};
		listView.setAdapter(new ArrayAdapter<String>(TestContacts.this, android.R.layout.simple_list_item_1, contacts));
		//item条目点击监听
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent data = new Intent();
				data.putExtra("name", contacts[position]);
				setResult(0, data);
				finish();
			}
		});
	}
}
