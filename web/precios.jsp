

<%@page import="Controlador.vehiculo"%>
<%@page import="DTO.vehiculo_DTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
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
                <a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button">
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
        <h1>Vehiculos por Precio</h1>
        <br><br>
        <div class="content">
            <div class="col-md-12">

                <table id="example" class="table table-condensed table-hover table-striped">
                    <thead>
                        <tr>
                            <th tabindex="0" rowspan="1" colspan="1">Modelo
                            </th>
                            <th tabindex="0" rowspan="1" colspan="1">Marca
                            </th>
                            <th tabindex="0" rowspan="1" colspan="1">Color                                        
                            </th>
                            <th tabindex="0" rowspan="1" colspan="1">Estado
                            </th>                                    
                            <th tabindex="0" rowspan="1" colspan="1">Precio
                            </th>
                            <th tabindex="0" rowspan="1" colspan="1">Vendedor
                            </th>                            
                            <th tabindex="0" rowspan="1" colspan="1">Boton
                            </th>
                        </tr>
                    </thead>

                    <tfoot>
                        <tr>
                            <th rowspan="1" colspan="1">Modelo</th>
                            <th rowspan="1" colspan="1">Marca</th>
                            <th rowspan="1" colspan="1">Color</th>                                    
                            <th rowspan="1" colspan="1">Estado</th>                                         
                            <th rowspan="1" colspan="1">Precio</th>                                    
                            <th rowspan="1" colspan="1">Vendedor</th>
                            <th rowspan="1" colspan="1">Boton</th>
                        </tr>
                    </tfoot>
                    <tbody>

                        <%
                                    try {
                                        vehiculo objVehiculo = new vehiculo();
                                        List<vehiculo_DTO> listaVehiculo = objVehiculo.MostrarvehiculosPrecio();

                                        for (int i = 0; i < listaVehiculo.size(); i++) {
                                            out.println("<tr>");
                                            out.println(" <td> " + listaVehiculo.get(i).getVehModelo()+ " </td>");
                                            out.println(" <td> " + listaVehiculo.get(i).getVehMarca()+ " </td>");                                            
                                            out.println(" <td> " + listaVehiculo.get(i).getVehColor()+ " </td>");
                                            out.println(" <td> " + listaVehiculo.get(i).getVehEstado()+ " </td>");
                                            out.println(" <td> " + listaVehiculo.get(i).getVehPrecio()+ " </td>");
                                            out.println(" <td> " + listaVehiculo.get(i).getDatNombre()+ " " + listaVehiculo.get(i).getDatApellido()+" </td>");
                                            out.println(" <td>");
                                            out.println("  <ul class='actions list-inline'>");  
                                            out.println("   <li>");
                                            
                                            out.println("    <a class='btn btn-default btn-xs' href='vendedorDetalle.jsp?"
                                                    + "modificar1=" + listaVehiculo.get(i).getDatUsuId()
                                                    + "'>Detalles</a>");
                                            out.println("  </ul>");
                                            out.println(" </td>");                                            
                                            out.println("<td>");
                                            out.println("  <ul class='actions list-inline'>");
                                            out.println("   <li>");
                                            out.println("   </li>");
                                            out.println("  </ul>");
                                            out.println(" </td>");
                                            out.println("</tr>");
                                        }
                                    } catch (Exception ex) {
                                        out.print("Error en la consulta " + ex);
                                     
                                    }
                                %>
                    </tbody>
                </table>
            </div>
        </div>
                
        <script type="text/javascript">
            $(document).ready(function () {
                $('#example').dataTable({
                    "sPaginationType": "full_numbers"
                });
            });
        </script> 
    </body>
</html>
