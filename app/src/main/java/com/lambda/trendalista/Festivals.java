package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Festivals extends Activity {

	Thread t;
	OccasionDataHelper odb;
	DressDataHelper ddb;
	private DataBaseHelper dbHelper;
	public SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_festivals);

		odb=new OccasionDataHelper(this);
		odb=odb.open();
		ddb=new DressDataHelper((this));
		ddb=ddb.open();
		
		t = new Thread(){
			
			public void run(){
				 try
				 {
					  Thread.sleep(2000);
					  Intent i = new Intent(Festivals.this,PartTwo.class);
					  startActivity(i);
				 }catch(Exception ee){ Toast.makeText(Festivals.this, ee.getMessage(), Toast.LENGTH_SHORT).show();}
			}
		
	}; t.start(); }

	public void selection()
	{
		db = dbHelper.getReadableDatabase();
		Cursor c = db.rawQuery("SELECT DRESS FROM OCCASION WHERE Q_OCCASION = ?", new String[] {"Festivals"});
		if(c.moveToFirst()){
			do{
				ddb.getImage(c.getInt(Cursor.FIELD_TYPE_INTEGER));
			}while(c.moveToNext());
		}
		c.close();
		db.close();
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.choose_occassion, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(Festivals.this, EditInfo.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(Festivals.this, Tips.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(Festivals.this, RateApp.class);
	       startActivity(in);}
		return true;
	}	
}
