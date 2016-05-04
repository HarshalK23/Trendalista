package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SecondPage extends Activity {
  Thread t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_page);
		
		 t = new Thread(){
			    public void run(){
			    	 try{
			    		  Thread.sleep(3000);
			    		  Intent i = new Intent(SecondPage.this,LoginActivity.class);
			    		  startActivity(i);
			    	 }catch(Exception ee){}
			    		  
			    	 }
		   };
		t.start();
		} }

