package com.example.myapplication.dao;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.myapplication.config.BDHelper;
import com.example.myapplication.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostDao {
    private BDHelper helper;
    private SQLiteDatabase database;
    public PostDao(Context context){
        helper = new BDHelper(context);
    }
    private SQLiteDatabase getDatabase(){
        if(database == null){
            database = helper.getWritableDatabase();
        }
        return database;
    }
    private Post crearPost(Cursor cursor){
         @SuppressLint("Range") Post post = new Post(
                cursor.getInt(cursor.getColumnIndex(BDHelper.Posts._ID)),
                cursor.getString(cursor.getColumnIndex(BDHelper.Posts.TITULO)),
                cursor.getString(cursor.getColumnIndex(BDHelper.Posts.DESCRIPCION))
        );
        return post;
    }
    public List<Post> listarPosts(){
        Cursor cursor = getDatabase().query(BDHelper.Posts.TABLE,BDHelper.Posts.COLUMNAS, null, null, null, null, null);
        List<Post> lista = new ArrayList<Post>();
        while(cursor.moveToNext()){
            Post modelo = crearPost(cursor);
            lista.add(modelo);
        }
        return lista;
    }

}
