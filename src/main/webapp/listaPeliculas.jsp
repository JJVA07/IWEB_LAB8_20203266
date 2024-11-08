

<%@page import="java.util.ArrayList"%>
<%@page import="com.example.lab8_20203266.beans.pelicula"%>
<%@page import="com.example.lab8_20203266.beans.genero"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<pelicula> listaPeliculas = (ArrayList) request.getAttribute("listaPeliculas");
    NumberFormat formatter = NumberFormat.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Películas</title>
</head>
<body>

<h1>Lista de Películas</h1>

<table border="1">
    <tr>

        <th>Titulo</th>
        <th>Director</th>
        <th>Ano Publicacion</th>
        <th>Rating</th>
        <th>BoxOffice</th>
        <th>Genero</th>
        <th>Actores</th>
        <th>Borrar</th>

    </tr>
    <%
        for (pelicula movie : listaPeliculas) {
    %>
    <tr>

        <td><a href="viewPelicula?idPelicula=<%= movie.getIdPelicula() %>"><%=movie.getTitulo()%></a></td>
        <td><%=movie.getDirector()%></td>
        <td><%=movie.getAnoPublicacion()%></td>
        <td><%=movie.getRating()%>/10</td>
        <td>$<%=formatter.format(movie.getBoxOffice())%></td>
        <td><%=movie.getId_Genero().getNombre()%></td>
        <td><a href="listaActores?idPelicula=<%= movie.getIdPelicula() %>">Ver Actores</a></td>
        <%
            if (1 == 1) {
        %>
        <td> <a href="listaPeliculas?action=borrar&idPelicula=<%= movie.getIdPelicula() %>" class="button-link">Borrar</a></td>
        <%
            }
        %>
    </tr>

    <%
        }
    %>

</table>

</body>
</html>