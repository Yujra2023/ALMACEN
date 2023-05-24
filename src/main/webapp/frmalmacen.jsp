<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Registro</h1>
        
         <h1>
            
             <c:if test="${almacen.id==0}">
             </c:if>  Nuevo registro
           
              <c:if test="${almacen.id!=0}">
             </c:if>  Editar registro
            
        </h1>
        <form action = "Inicio" method="post">
            <input type ="hidden" name="id" value="${aviso.id}"/>
            <table>
                <tr>
                    <td>Cantidad</td>
                    <td><input type="text" name="cantidad" value="${almacen.cantidad}"/></td>
                </tr>
                <tr>
                    <td>Descripcion</td>
                    <td>
                        <textarea name="descripcion" rows="4" cols="20">${almacen.descripcion}
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><input type="text" name="precio" value="${almacen.precio}"/></td>
                </tr>
                
                <tr>
                    <td>Categoria</td>
                    <td>
                        <textarea name="categoria" rows="4" cols="20"> ${almacen.categoria}
                        </textarea>
                    </td>
                </tr>

                <tr>
                    <td>Enviar</td>
                    <td><input type="submit"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
