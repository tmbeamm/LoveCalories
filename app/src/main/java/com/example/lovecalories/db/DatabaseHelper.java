package com.example.lovecalories.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tmbeamm on 12/14/2016 AD.
 */

public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "lovecal.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "foodcalories";
    public static final String COL_ID = "_id";
    public static final String COL_FOOD = "food";
    public static final String COL_CAL = "phone";
    public static final String COL_DATE = "date";

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_FOOD + " TEXT,"
                    + COL_CAL + " INT,"
                    + COL_DATE + " TEXT"
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
