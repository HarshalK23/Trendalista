package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Details extends Activity implements OnClickListener{

	Button b;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		
	    b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		
	Intent i = new Intent(Details.this, Complexion.class);
	startActivity(i);
			
		}
		
	}

