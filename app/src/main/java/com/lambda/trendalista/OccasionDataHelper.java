package com.lambda.trendalista;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class OccasionDataHelper {

			static final String DATABASE_NAME = "login.db";
			static final int DATABASE_VERSION = 1;
			public static final int NAME_COLUMN = 1;
			// TODO: Create public field for each column in your table.
			// SQL Statement to create a new database.
			
			static final String DATABASE_SECOND = "create table "+"OCCASION"+
	                "( "+"Q_AGE integer,Q_COMPLEXION  integer,Q_WEIGHT integer,Q_HEIGHT integer,Q_OCCASION text,Q_DRESS number,PRIMARY KEY(Q_AGE,Q_COMPLEXION,Q_WEIGHT,Q_HEIGHT,Q_OCCASION));";
			
			
			// Variable to hold the database instance
			public  SQLiteDatabase db;
			// Context of the application using the database.
			private final Context context;
			// Database open/upgrade helper
			private DataBaseHelper dbHelper;
			public OccasionDataHelper(Context _context) 
			{
				context = _context;
				dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
			}
			public  OccasionDataHelper open() throws SQLException 
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
	 
			public void insertEntryWeight(int weight)
			{
		       ContentValues newValues = new ContentValues();
				// Assign values for each row.
				newValues.put("Q_WEIGHT", weight);
	 
				// Insert the row into your table
				db.insert("SECOND", null, newValues);
				///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
			}
			public void insertEntryHeight(int height)
			{
		       ContentValues newValues = new ContentValues();
				// Assign values for each row.
				newValues.put("Q_HEIGHT", height);
	 
				// Insert the row into your table
				db.insert("HEIGHT", null, newValues);
				///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
			}
			public void insertEntryComplexion(int complexion)
			{
		       ContentValues newValues = new ContentValues();
				// Assign values for each row.
				newValues.put("Q_COMPLEXION", complexion);
	 
				// Insert the row into your table
				db.insert("SECOND", null, newValues);
				///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
			}
			public void insertEntryAge(int age)
			{
		       ContentValues newValues = new ContentValues();
				// Assign values for each row.
				newValues.put("Q_AGE", age);
	 
				// Insert the row into your table
				db.insert("SECOND", null, newValues);
				///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
			}
			public void insertEntryOccasion(String occasion)
			{
		       ContentValues newValues = new ContentValues();
				// Assign values for each row.
				newValues.put("Q_OCCASION", occasion
						);
	 
				// Insert the row into your table
				db.insert("SECOND", null, newValues);
				///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
			}
			
			public int deleteEntry(String UserName)
			{
				//String id=String.valueOf(ID);
			    String where="USERNAME=?";
			    int numberOFEntriesDeleted= db.delete("SECOND", where, new String[]{UserName}) ;
		       // Toast.makeText(context, "Number for Entry Deleted Successfully : "+numberOFEntriesDeleted, Toast.LENGTH_LONG).show();
		        return numberOFEntriesDeleted;
			}	
			public String getSinlgeEntry(String occasion)
			{
				Cursor cursor=db.query("SECOND", null, " Q_OCCASION=?", new String[]{occasion}, null, null, null);
		        if(cursor.getCount()<1) // UserName Not Exist
		        {
		        	cursor.close();
		        	return "NOT EXIST";
		        }
			    cursor.moveToFirst();
				String password= cursor.getString(cursor.getColumnIndex("Q_DRESS"));
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

