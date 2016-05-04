package com.lambda.trendalista;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
 
public class LoginDataBaseAdapter 
{
		static final String DATABASE_NAME = "login.db";
		static final int DATABASE_VERSION = 1;
		public static final int NAME_COLUMN = 1;
		// TODO: Create public field for each column in your table.
		// SQL Statement to create a new database.
		static final String DATABASE_CREATE = "create table "+"LOGIN"+
		                             "( " +"ID"+" integer primary key autoincrement,"+ "USERNAME  text,PASSWORD text,WEIGHT integer,HEIGHT integer,COMPLEXION integer,AGE integer );";
		
		// Variable to hold the database instance
		public  SQLiteDatabase db;
		// Context of the application using the database.
		private final Context context;
		// Database open/upgrade helper
		private DataBaseHelper dbHelper;
		public  LoginDataBaseAdapter(Context _context) 
		{
			context = _context;
			dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		public  LoginDataBaseAdapter open() throws SQLException 
		{
			db = dbHelper.getWritableDatabase();
			return this;
		}
		public void close() 
		{
			db.close();
		}

	    public String getyourdata(){

		String Table_Name="LOGIN";

		String selectQuery = "SELECT  * FROM " + "LOGIN" ;
		SQLiteDatabase db = dbHelper.getReadableDatabase();
			Cursor cursor = db.query("LOGIN", new String[] { "USERNAME" }, "id = ?", new String[] { "USERNAME" }, null, null, null);
		String data = null;
			if (cursor.moveToFirst()) {
			do {
				String user = cursor.getString(Cursor.FIELD_TYPE_STRING);
				int height = cursor.getInt(Cursor.FIELD_TYPE_INTEGER);
				int weight = cursor.getInt(Cursor.FIELD_TYPE_INTEGER);
				int age = cursor.getInt(Cursor.FIELD_TYPE_INTEGER);
				int complexion = cursor.getInt(Cursor.FIELD_TYPE_INTEGER);
			} while (cursor.moveToNext());
		}
		db.close();
		return data;
	}
 
		public  SQLiteDatabase getDatabaseInstance()
		{
			return db;
		}
 
		public void insertEntry(String userName,String password)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("USERNAME", userName);
			newValues.put("PASSWORD",password);
 
			// Insert the row into your table
			db.insert("LOGIN", null, newValues);
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		public void insertEntryWeight(int weight)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("WEIGHT", weight);
 
			// Insert the row into your table
			db.insert("LOGIN", null, newValues);
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		public void insertEntryHeight(int height)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("HEIGHT", height);
 
			// Insert the row into your table
			db.insert("LOGIN", null, newValues);
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		public void insertEntryComplexion(int complexion)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("COMPLEXION", complexion);
 
			// Insert the row into your table
			db.insert("LOGIN", null, newValues);
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		public void insertEntryAge(int age)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("AGE", age);
 
			// Insert the row into your table
			db.insert("LOGIN", null, newValues);
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		
		public int deleteEntry(String UserName)
		{
			//String id=String.valueOf(ID);
		    String where="USERNAME=?";
		    int numberOFEntriesDeleted= db.delete("LOGIN", where, new String[]{UserName}) ;
	       // Toast.makeText(context, "Number for Entry Deleted Successfully : "+numberOFEntriesDeleted, Toast.LENGTH_LONG).show();
	        return numberOFEntriesDeleted;
		}	
		public String getSinlgeEntry(String userName)
		{
			Cursor cursor=db.query("LOGIN", null, " USERNAME=?", new String[]{userName}, null, null, null);
	        if(cursor.getCount()<1) // UserName Not Exist
	        {
	        	cursor.close();
	        	return "NOT EXIST";
	        }
		    cursor.moveToFirst();
			String password= cursor.getString(cursor.getColumnIndex("PASSWORD"));
			cursor.close();
			return password;				
		}
		public void  updateEntry(String userName,String password)
		{
			// Define the updated row content.
			ContentValues updatedValues = new ContentValues();
			// Assign values for each row.
			updatedValues.put("USERNAME", userName);
			updatedValues.put("PASSWORD",password);
 
	        String where="USERNAME = ?";
		    db.update("LOGIN",updatedValues, where, new String[]{userName});			   
		}		
}