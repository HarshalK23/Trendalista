package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainCollege extends Activity {
	ViewPager v;
	PagerAdapter adapter;
	int[] flag_clg;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from viewpager_main.xml
		setContentView(R.layout.activity_main_college);


		flag_clg = new int[] {R.drawable.clg1,R.drawable.clg2,R.drawable.clg3,R.drawable.clg4,R.drawable.clg5,R.drawable.clg6,R.drawable.clg7,R.drawable.clg8,R.drawable.clg9,R.drawable.clg10,R.drawable.clg11,R.drawable.clg12,R.drawable.clg13,R.drawable.clg14,R.drawable.clg16,R.drawable.clg17};

		v = (ViewPager) findViewById(R.id.pager);

		adapter = new ViewPagerAdapter(MainCollege.this, flag_clg);

		v.setAdapter(adapter);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {


		if(item.getTitle().equals("Settings"))
		{   Intent in = new Intent(MainCollege.this, EditInfo.class);
			startActivity(in);}

		if(item.getTitle().equals("Privacy Policy"))
		{   Intent in = new Intent(MainCollege.this, Tips.class);
			startActivity(in);}

		if(item.getTitle().equals("Rate the App"))
		{   Intent in = new Intent(MainCollege.this, RateApp.class);
			startActivity(in);}
		return true;
	}
}