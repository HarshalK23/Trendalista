package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Weight extends Activity implements OnClickListener{

	static Weight INSTANCE;
	int x;
	LoginDataBaseAdapter ldb;
	EditText ed;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		INSTANCE = this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
		ldb=new LoginDataBaseAdapter(this);
		ldb=ldb.open();
		
		ed =(EditText)findViewById(R.id.editText1);
		b =(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(this);
		
	}
	 public static Weight getWeightActivityInstance()
	   {
	     return INSTANCE;
	   }

	 public int getWeightData()
	   { 		x = Integer.parseInt(ed.getText().toString());
	            return this.x;
	   }
	@Override
	public void onClick(View v) {
		
		if(ed.getText().toString().equals("")) {Toast.makeText(Weight.this, "The weight field cannot be empty",Toast.LENGTH_SHORT).show();  }
		else{
		int x = Integer.parseInt(ed.getText().toString());
		ldb.insertEntryWeight(x); }
		Intent i = new Intent(Weight.this, Occasion.class);
		startActivity(i);
		
	}
}
