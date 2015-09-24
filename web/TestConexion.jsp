<%@page import="Conexion.mysql"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%   /*Creo Un objeto de tipo Conexion*/
            Connection Conn = mysql.Conexion();
            if (Conn != null) {
                out.print("Conexion Exitosa" + "<br /><br />");
            } else {
                out.print("Error al Conectar " + Conn);
            }
        %>
    </body>
</html>
