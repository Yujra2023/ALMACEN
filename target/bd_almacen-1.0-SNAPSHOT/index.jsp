
<%@page import="com.emergentes.modelo.Almacen"%>
<%@page import="java.util.List"%>
<%
    List<Almacen> almacen= (List<Almacen>)request.getAttribute("almacen");
    %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Almacen Micromarket</h1>
        <br>
        <h2>SEGUNDO PARCIAL</h2>
        <br>
        <h2>Nombre: Dora Condori Yujra</h2>
        <br>
        <h2>Ci: 8442053LP</h2>
        <BR>
        <a href="Inicio?action=add">Nuevo Producto</a>
        <table border ="1">
            <tr>
                <th>Id</th>
                <th>Cantidad</th>
                <th>Descripcion</th>
                <th>Precio</th>
                <th>Categoria</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${almacen}">
            <tr>
                    <td>${item.id}</td>
                    <td>${item.cantidad}</td>
                    <td>${item.descripcion}</td>
                    <td>${item.precio}</td>
                    <td>${item.categoria}</td>
                    <td><a href="Inicio?action=edit&id=${item.id}">Editar</a></td>
                    <td><a href="Inicio?action=delete&id=${item.id}" onclick="return(confirm('Esta seguro de eliminar ???'))">Eliminar</a></td>
                </tr>
            </c:forEach> 
            
        </table>
    </body>
</html>
