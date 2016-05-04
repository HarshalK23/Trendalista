package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class Trendalista extends Activity {

	Thread t;
	MediaPlayer backgroundsong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	   requestWindowFeature(Window.FEATURE_NO_TITLE);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
       WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_trendalista);
		
	    backgroundsong= MediaPlayer.create(Trendalista.this, R.raw.inspi);
	    backgroundsong.start();
	
   t = new Thread(){
	    public void run(){
	    	 try{
	    		  Thread.sleep(3000);
	    		  Intent i = new Intent(Trendalista.this,SecondPage.class);
	    		  startActivity(i);
	    	 }catch(Exception ee){}
	    		  
	    	 }
   };
t.start();
} }