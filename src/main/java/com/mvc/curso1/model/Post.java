package com.mvc.curso1.model;

import java.util.Date;

public class Post {
    //variables
    private int id;
    private String description;
    private String urlImg;
    private Date date;
    private String titulo;

    //setter y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //constructor
    public Post(int id, String description, String urlImg, Date date, String titulo) {
        this.id = id;
        this.description = description;
        this.urlImg = urlImg;
        this.date = date;
        this.titulo = titulo;
    }
}
