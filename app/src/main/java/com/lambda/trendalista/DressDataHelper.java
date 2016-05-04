package com.lambda.trendalista;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

public class DressDataHelper {

	private byte[] img=null;
	static final String DATABASE_NAME = "login.db";
	static final int DATABASE_VERSION = 1;
	public static final int NAME_COLUMN = 1;


	static final String DATABASE_SECOND = "create table "+"DRESSES"+
			"( "+"DRESS_ID integer,SUGG_1 BLOB ,SUGG_2 BLOB,SUGG_3 BLOB,SUGG_4 BLOB,SUGG_5 BLOB,SUGG_6 BLOB,SUGG_7 BLOB, PRIMARY KEY(DRESS_ID));";


	// Variable to hold the database instance
	public  SQLiteDatabase db;
	// Context of the application using the database.
	private final Context context;
	// Database open/upgrade helper
	private DataBaseHelper dbHelper;
	public DressDataHelper(Context _context)
	{
		context = _context;
		dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	public  DressDataHelper open() throws SQLException
	{
		db = dbHelper.getWritableDatabase();
		return this;
	}
	public void close()
	{
		db.close();
	}

	public  SQLiteDatabase getDatabaseInstance()
	{
		return db;
	}

	public void AddImage(Dresses d) {
		 db = dbHelper.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put("image", img); // Contact Phone

		db.insert("DRESSES", null, values);
		db.close(); // Closing database connection
	}


	public static byte[] getBitmapAsByteArray(Bitmap bitmap) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.PNG, 0, outputStream);
		return outputStream.toByteArray();
	}

	public Bitmap getImage(int i){

		String qu = "select img  from DRESSES where DRESS_ID=" + i ;
		Cursor cur = db.rawQuery(qu, null);

		if (cur.moveToFirst()){
			byte[] imgByte = cur.getBlob(0);
			cur.close();
			return BitmapFactory.decodeByteArray(imgByte, 0, imgByte.length);
		}
		if (cur != null && !cur.isClosed()) {
			cur.close();
		}

		return null ;
	}


}

