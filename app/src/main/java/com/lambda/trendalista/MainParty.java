package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainParty extends Activity {

	ViewPager v;
	PagerAdapter adapter;
	int[] flag;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from viewpager_main.xml
		setContentView(R.layout.activity_main_party);

 
		flag = new int[] {R.drawable.p_y_t_1,R.drawable.p_y_t_2,R.drawable.p_y_t_3,R.drawable.party10,R.drawable.party11,R.drawable.party9,R.drawable.party8,R.drawable.party7,R.drawable.party6,R.drawable.party5,R.drawable.party_4};

		v = (ViewPager) findViewById(R.id.pager);
		
		adapter = new ViewPagerAdapter(MainParty.this, flag);
	
		v.setAdapter(adapter);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		

	   if(item.getTitle().equals("Settings"))
	   {   Intent in = new Intent(MainParty.this, EditInfo.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Privacy Policy"))
	   {   Intent in = new Intent(MainParty.this, Tips.class);
	       startActivity(in);}

	   if(item.getTitle().equals("Rate the App"))
	   {   Intent in = new Intent(MainParty.this, RateApp.class);
	       startActivity(in);}
		return true;
	}	
}