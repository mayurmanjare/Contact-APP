package com.example.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactAddActivity extends Activity {
	EditText e1;
	Button add;
	EditText e2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		e1=(EditText) findViewById(R.id.edittextaddcontct);
		add=(Button) findViewById(R.id.addbtn);
		e2=(EditText) findViewById(R.id.editText_no);
	}
	public void add(View v)
	{
		Intent intent=new Intent();
		intent.putExtra("addedString",e1.getText().toString());
		intent.putExtra("addedNo", e2.getText().toString());
		setResult(4, intent);
		finish();
		//mayuretbdhj
		
	}

}
