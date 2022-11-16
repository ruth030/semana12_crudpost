package com.example.myapplication.config;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDHelper extends SQLiteOpenHelper {
    private static final String DB_NAME  = "DB2022";
    private static final int DB_VERSION = 1;
    public BDHelper(Context context){
        super(context,DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table posts(_id integer primary key autoincrement, "
                +"titulo text not null, descripcion text not null)");
        db.execSQL("insert into posts(titulo, descripcion) values('Java', 'Lenguaje con tipado alto')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public static class Posts{
        public static final String TABLE = "posts";
        public static final String _ID = "_id";
        public static final String TITULO = "titulo";
        public static final String DESCRIPCION = "descripcion";
        public static final String[] COLUMNAS = new String[]{_ID, TITULO, DESCRIPCION};
    }
}
