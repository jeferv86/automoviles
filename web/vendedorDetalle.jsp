
<%@page import="DTO.datosPersonales_DTO"%>
<%@page import="Controlador.vendedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link href="css/bootstrap.css" rel="stylesheet">     
        <link href="css/bootstrap-datepicker.min.css" rel="stylesheet">        
        <link href="css/jquery.dataTables.css" rel="stylesheet">        
        <link href="css/toastr.css" rel="stylesheet">

        <script src="js/jquery-latest.js"></script>
        <script src="js/bootstrap.min.js"></script>        
        <script src="js/bootstrap-datepicker.min.js"></script>
        <script src="js/bootstrap-datepicker.es.js"></script>
        <script src="js/jquery.dataTables.js"></script>
        <script src="js/toastr.js"></script>

        <script src="js/validaciones.js"></script>
    </head>
    <body>

        <ul class="nav nav-pills" style="background-color:buttontext">
            <li role="presentation" class="dropdown" id="comprador">
                <a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button" >
                    Cliente
                    <span class="caret"></span>
                </a>
                <ul id="menu1" class="dropdown-menu" role="menu" aria-labelledby="drop4">
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="categorias.jsp">Buscar por categoria</a></li>
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="precios.jsp">Buscar por precio</a></li>                              
                </ul>

            <li class="dropdown">
                <a>
                    jeronimo
                </a>
            </li>
        </ul>

        <h1>Datos Vendedor</h1>

        <div class="col-sm-9">
            <%
                String cedula = request.getParameter("modificar1");
               
                if (cedula != null && (new vendedor().MostrarCliente(Integer.parseInt(cedula))) != null) {

                    datosPersonales_DTO vendedor = new vendedor().MostrarCliente(Integer.parseInt(cedula));
            %>

            <form class="form-horizontal" role="form" action="vehiculo" method="post" >

                <div class="form-group obligatorio">
                    <label class="col-sm-3 control-label">Nombre</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehPlaca" name="vehPlaca" 
                               value="<%out.print(vendedor.getDatNombre());%>">
                    </div>
                </div>

                <div class="form-group obligatorio">
                    <label class="col-sm-3 control-label">Apellido</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehModelo" name="vehModelo"
                               value="<%out.print(vendedor.getDatNombre());%>">
                    </div>
                </div>

                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Telefono de contacto</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="PERNOMBRE" name="PERNOMBRE" 
                               value="<%out.print(vendedor.getDaTelefono());%>">
                    </div>
                </div>


                <div class="form-group ">
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-9">
                        <button type="submit" class="btn btn-success">Volver</button>
                    </div>
                </div>
                <div class="form-group">
                </div>
            </form>
        </div>        
    </body>
</html>
