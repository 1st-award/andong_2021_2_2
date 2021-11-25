package com.example.jagajindan_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDBHelper extends SQLiteOpenHelper {
    public myDBHelper(Context context) {
        super(context, "DormStudentList", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DormStudentList ( studentNumber INTEGER PRIMARY KEY, studentName CHAR(20) , studentBirth INTEGER, studentPW CHAR(50));");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS DormStudentList");
        onCreate(db);
    }
}