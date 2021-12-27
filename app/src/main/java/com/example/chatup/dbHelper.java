package com.example.chatup;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "storeimage.db";
    public dbHelper(@Nullable Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create = "create table "+TABLE_NAME+"("
                +Contract._ID+" integer,"
                + Contract.IMAGE + " BLOB);";
        sqLiteDatabase.execSQL(Create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
