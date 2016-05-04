package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Age extends Activity implements OnClickListener{

	static Age INSTANCE;
	Spinner sp;
	int a=0;int n;
	LoginDataBaseAdapter ldb;
	Button submit;
	int x;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		INSTANCE = this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_age);
		ldb=new LoginDataBaseAdapter(this);
		ldb=ldb.open();
		
		sp=(Spinner)findViewById(R.id.spinner1);
		submit=(Button)findViewById(R.id.button1);
		
		submit.setOnClickListener(this);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
			
				if(position==0){}
				
				else {Toast.makeText(Age.this, "You chose"+position+sp.getSelectedItem(), Toast.LENGTH_SHORT).show();
				      String x = (String) sp.getItemAtPosition(position);
				      
				      if(x.equals("20-25")) a=1;
				      else if (x.equals("25-30")) a=2; 
				      else if (x.equals("30-35")) a=3; 
				      else if (x.equals("35-40")) a=4;
				      else if (x.equals("40-45")) a=5;
				      else if (x.equals("45-50")) a=6;
				      
				     n= putData(a);
				       ldb.insertEntryAge(a); 
				         }
			}
			

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub	
			}
			
			
		});
		}

          public static Age getAgeActivityInstance()
         {
          return INSTANCE;
                 }
          
          public int getAgeData()
          {   
        	   return this.n;
          }

          public static int putData(int a)
          {  
        	  return a;
        	  
          }
      
	@Override
	public void onClick(View v) {
		Intent i =new Intent(Age.this, Height.class);
		startActivity(i);
		
	}
	}
