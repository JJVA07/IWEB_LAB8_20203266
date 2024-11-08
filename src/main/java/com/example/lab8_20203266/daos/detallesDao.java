package com.example.lab8_20203266.daos;

import com.example.lab8_20203266.beans.genero;
import com.example.lab8_20203266.beans.pelicula;

import java.sql.*;

public class detallesDao extends baseDao{

    public pelicula obtenerPelicula(int idPelicula) {

        pelicula movie = new pelicula();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();

            String sql = "SELECT A.*, B.NOMBRE FROM \n" +
                    "(SELECT * FROM PELICULA WHERE IDPELICULA = \n" +
                     idPelicula +
                    ") AS A \n" +
                    "INNER JOIN \n" +
                    "(SELECT * FROM GENERO) AS B\n" +
                    "ON A.IDGENERO = B.IDGENERO";
            // hacer el join con el genero y pedir que se haga por rating desc
            // agregar buscador

            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {

                genero genero = new genero();

                int id = rs.getInt(1);
                movie.setIdPelicula(id);
                String titulo = rs.getString("titulo");
                movie.setTitulo(titulo);
                String director = rs.getString("director");
                movie.setDirector(director);
                int anoPublicacion = rs.getInt("anoPublicacion");
                movie.setAnoPublicacion(anoPublicacion);
                double rating = rs.getDouble("rating");
                movie.setRating(rating);
                double boxOffice = rs.getDouble("boxOffice");
                movie.setBoxOffice(boxOffice);

                String nombregenero = rs.getString("nombre");
                genero.setNombre(nombregenero);
                movie.setId_Genero(genero);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return movie;
    }
}
