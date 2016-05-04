package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Complexion extends Activity implements OnClickListener{
	
	static Complexion INSTANCE;
	int a;
   Button light,fair,wheatish,moderate,brown,dark;
   Button next;
   LoginDataBaseAdapter ldb;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		INSTANCE = this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complexion);
		
		ldb=new LoginDataBaseAdapter(this);
		ldb=ldb.open();
		
		light=(Button)findViewById(R.id.light);
		fair=(Button)findViewById(R.id.fair);
		wheatish=(Button)findViewById(R.id.wheatish);
		moderate=(Button)findViewById(R.id.moderate);
		brown=(Button)findViewById(R.id.brown);
		dark=(Button)findViewById(R.id.dark);
		next=(Button)findViewById(R.id.next);
		
		
		light.setOnClickListener(this);
		fair.setOnClickListener(this);
		wheatish.setOnClickListener(this);
		moderate.setOnClickListener(this);
		brown.setOnClickListener(this);
		dark.setOnClickListener(this);
		next.setOnClickListener(this);
	}

	 public static Complexion getComplexionActivityInstance()
	   {
	     return INSTANCE;
	   }

	 public int getComplexionData()
	   {
		return a; 		
	   }
	@Override
	public void onClick(View v) {
		
		

		switch(v.getId())
		{
		case R.id.light:
			  Toast.makeText(getApplicationContext(), "You Chose light", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(1);
			  a=1;
			
			  break;
			  
		case R.id.fair:
			  Toast.makeText(getApplicationContext(), "You Chose fair", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(2);
			  a=2;
			
			  break;
			  
		case R.id.wheatish:
			  Toast.makeText(getApplicationContext(), "You Chose wheatish", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(3);
			  a=3;
		
			  break;
			  
		case R.id.moderate:
			  Toast.makeText(getApplicationContext(), "You Chose moderate", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(4);
			  a=4;
			 
			  break;
			  
		case R.id.brown:
			  Toast.makeText(getApplicationContext(), "You Chose brown", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(5);
			  a=5;
			
			  break;
			  
		case R.id.dark:
			  Toast.makeText(getApplicationContext(), "You Chose dark", Toast.LENGTH_SHORT).show();
			  ldb.insertEntryComplexion(6);
			  a=6;
			  break;
			  
		case R.id.next:
			Intent i =new Intent(Complexion.this, Age.class);
			  startActivity(i);
			  break;
			
			  
		
		
		}

	}
}

