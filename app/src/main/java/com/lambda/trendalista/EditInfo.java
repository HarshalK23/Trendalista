package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EditInfo extends Activity implements OnClickListener{
	
	
  Button c,a,w,h;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_info);
		
		c=(Button)findViewById(R.id.button1);
		a=(Button)findViewById(R.id.button4);
		w=(Button)findViewById(R.id.button2);
		h=(Button)findViewById(R.id.button3);
		
		c.setOnClickListener(this);
		a.setOnClickListener(this);
		w.setOnClickListener(this);
		h.setOnClickListener(this);
		
		
		
	}

	@Override
	public void onClick(View v) {
	   
		switch(v.getId())
	{
		case R.id.button1:
		Intent i1 = new Intent(EditInfo.this,Complexion.class);
		startActivity(i1);
		
		case R.id.button2:
			Intent i2 = new Intent(EditInfo.this,Weight.class);
			startActivity(i2);
			
		case R.id.button3:
			Intent i3 = new Intent(EditInfo.this,Height.class);
			startActivity(i3);
			
		case R.id.button4:
			Intent i4 = new Intent(EditInfo.this,Age.class);
			startActivity(i4);
		
		
	}
}
}
	