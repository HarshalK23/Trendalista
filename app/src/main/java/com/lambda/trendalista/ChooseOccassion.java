package com.lambda.trendalista;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ChooseOccassion extends ListActivity{
	
	String occ[]={"Parties","Festivals","College","Office" };
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_occassion);
		System.out.println("2");
	
		ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, occ);
		System.out.println("3");

		setListAdapter(ad);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Toast.makeText(this, occ[position], Toast.LENGTH_SHORT).show();
		try
		{    		System.out.println("4");

			 String str = "com.lambda.trendalista."+occ[position];
			 
			 Class<?> c = Class.forName(str);
			 Intent i =new Intent(ChooseOccassion.this,c);
			 startActivity(i);
				System.out.println("5");

		} catch(Exception ee) { System.out.println("error"+ ee.getMessage());
		 // Toast.makeText(this,"ERROR"+ee.getMessage() ,Toast.LENGTH_SHORT ).show(); 
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choose_occassion, menu);
        return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
	   if(item.getTitle().equals("EditInfo"))
	   {   Intent in = new Intent(ChooseOccassion.this, EditInfo.class);
	       startActivity(in);
	        return true;}

	   else if(item.getTitle().equals("Tips"))
	   {   Intent in = new Intent(ChooseOccassion.this, Tips.class);
	       startActivity(in);
	       return true;}

	   else if(item.getTitle().equals("RateApp"))
	   {   Intent in = new Intent(ChooseOccassion.this, RateApp.class);
	       startActivity(in);
	       return true;}
       return super.onOptionsItemSelected(item);
	}	
	
   
}

