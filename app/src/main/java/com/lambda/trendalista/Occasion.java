package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Occasion extends Activity implements OnClickListener{
	
	Button b;
	LoginDataBaseAdapter ldb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_occasion);

		ldb = new LoginDataBaseAdapter(this);
		
		b = (Button)findViewById(R.id.button1);
		
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		ldb.open();
		String text= ldb.getyourdata();//this is the method to query
		System.out.println("'"+text);
		ldb.close();
		Intent i = new Intent(Occasion.this,ChooseOccassion.class);
		startActivity(i);
		
	}

	
}
