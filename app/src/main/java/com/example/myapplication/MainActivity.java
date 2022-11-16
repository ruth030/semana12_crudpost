package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.PostAdapter;
import com.example.myapplication.dao.PostDao;
import com.example.myapplication.model.Post;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lista1;
    private List<Post> listaList;
    private PostAdapter adapter;
    private PostDao usuarioDAO;
    private int idposi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuarioDAO = new PostDao(this);
        listaList = usuarioDAO.listarPosts();
        adapter = new PostAdapter(this,listaList);

        lista1 = (ListView) findViewById(R.id.lvPosts);
        lista1.setAdapter(adapter);
    }
}