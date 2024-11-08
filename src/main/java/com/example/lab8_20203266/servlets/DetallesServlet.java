package com.example.lab8_20203266.servlets;

import com.example.lab8_20203266.beans.pelicula;
import com.example.lab8_20203266.daos.detallesDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "detalle-servlet", value = "/viewPelicula")
public class
DetallesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        int idPelicula = Integer.parseInt(request.getParameter("idPelicula"));
        detallesDao detallesDao = new detallesDao();
        pelicula movie = detallesDao.obtenerPelicula(idPelicula);
        request.setAttribute("pelicula", movie);

        RequestDispatcher view = request.getRequestDispatcher("detalles.jsp");
        view.forward(request,response);
    }
}
