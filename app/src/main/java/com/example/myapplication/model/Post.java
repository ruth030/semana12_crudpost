package com.example.myapplication.model;

public class Post {
    private int _id;
    private String titulo;
    private String descripcion;

    public Post() {
    }

    public Post(int _id, String titulo, String descripcion) {
        this._id = _id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
