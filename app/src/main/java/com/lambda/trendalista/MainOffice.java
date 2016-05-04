package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainOffice extends Activity {

	ViewPager v;
	PagerAdapter adapter;
	int[] flag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from viewpager_main.xml
		setContentView(R.layout.activity_main_party);


		flag = new int[] {R.drawable.office1,R.drawable.office2,R.drawable.office3,R.drawable.office4,R.drawable.office5,R.drawable.office7,R.drawable.office9};

		v = (ViewPager) findViewById(R.id.pager);

		adapter = new ViewPagerAdapter(MainOffice.this, flag);

		v.setAdapter(adapter);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {


		if(item.getTitle().equals("Settings"))
		{   Intent in = new Intent(MainOffice.this, EditInfo.class);
			startActivity(in);}

		if(item.getTitle().equals("Privacy Policy"))
		{   Intent in = new Intent(MainOffice.this, Tips.class);
			startActivity(in);}

		if(item.getTitle().equals("Rate the App"))
		{   Intent in = new Intent(MainOffice.this, RateApp.class);
			startActivity(in);}
		return true;
	}
}