package com.example.lab8_20203266.beans;

public class pelicula {

    private int idPelicula;
    private String titulo;

    private String director;
    private int anoPublicacion;
    private Double rating;
    private double boxOffice;
    private genero id_Genero;

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(double boxOffice) {
        this.boxOffice = boxOffice;
    }

    public genero getId_Genero() {return id_Genero;}

    public void setId_Genero(genero id_Genero) {this.id_Genero = id_Genero;}



}
