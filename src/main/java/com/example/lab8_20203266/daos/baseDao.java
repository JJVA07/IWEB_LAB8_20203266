package com.example.lab8_20203266.daos;

import com.example.lab8_20203266.beans.pelicula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class baseDao {

    protected Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }

}



