package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainFestival extends Activity {

	ViewPager v;
	PagerAdapter adapter;
	int[] flag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from viewpager_main.xml
		setContentView(R.layout.activity_main_party);


		flag = new int[] {R.drawable.fest1,R.drawable.fest2,R.drawable.fest3,R.drawable.fest5,R.drawable.fest7,R.drawable.fest10,R.drawable.fest11,R.drawable.fest12,R.drawable.fest13,R.drawable.fest14,R.drawable.fest15,R.drawable.fest16,R.drawable.fest17,R.drawable.fest19,R.drawable.fest20};

		v = (ViewPager) findViewById(R.id.pager);

		adapter = new ViewPagerAdapter(MainFestival.this, flag);

		v.setAdapter(adapter);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {


		if(item.getTitle().equals("Settings"))
		{   Intent in = new Intent(MainFestival.this, EditInfo.class);
			startActivity(in);}

		if(item.getTitle().equals("Privacy Policy"))
		{   Intent in = new Intent(MainFestival.this, Tips.class);
			startActivity(in);}

		if(item.getTitle().equals("Rate the App"))
		{   Intent in = new Intent(MainFestival.this, RateApp.class);
			startActivity(in);}
		return true;
	}
}