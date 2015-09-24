
<%@page import="java.util.List"%>
<%@page import="DTO.categoria_DTO"%>
<%@page import="Controlador.categoria"%>
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
                <a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button" aria-expanded="false">
                    Vendedor
                    <span class="caret"></span>
                </a>
                <ul id="menu1" class="dropdown-menu" role="menu" aria-labelledby="drop4">
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="registrarVehiculo.jsp">Registrar Vehiculo</a></li>                    
                </ul>

            <li class="dropdown">
                <a>
                    jeronimo
                </a>
            </li>
        </ul>

        <h1>Registar Vehiculo</h1>

        <div class="col-sm-9">

            <form class="form-horizontal" role="form" action="vehiculo" method="post" onsubmit="return validarCampos($('.obligatorio'))">

                <div class="form-group obligatorio">
                    <label class="col-sm-3 control-label">Placa</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehPlaca" name="vehPlaca" placeholder="Placa";
                               validarPersona(this)">
                    </div>
                </div>

                <div class="form-group obligatorio">
                    <label class="col-sm-3 control-label">Modelo</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehModelo" name="vehModelo" placeholder="Modelo";
                               validarPersona(this)">
                    </div>
                </div>

                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Nombre</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="PERNOMBRE" name="PERNOMBRE" placeholder="Nombre" onblur="revisarObligatorio(this)">
                    </div>
                </div>
                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Marca</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehMarca" name="vehMarca" placeholder="Marca" onblur="revisarObligatorio(this)">
                    </div>
                </div>
                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Estado</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehEstado" name="vehEstado" placeholder="Estado" onblur="revisarObligatorio(this)">
                    </div>
                </div>
                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Precio</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="vehPrecio" name="vehPrecio" placeholder="Precio" onblur="revisarObligatorio(this)">
                    </div>
                </div>
                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Categoria</label>
                    <div class="col-sm-9">
                        <select clsss="form-control">
                            <option Value="-1">Selecciione una categoria...</option>
                            <option></option>
                            <option></option>
                            <option></option>
                        </select>
                    </div>
                </div>
                <div class="form-group obligatorio">
                    <label  class="col-sm-3 control-label">Vendedor</label>
                    <div class="col-md-7">
                        <select id="myselect" class="form-control">
                        </select>                                    
                    </div>
                </div>   

                <div class="form-group ">
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-9">
                        <button type="submit" class="btn btn-success" name="btnRgistrar">Registrar</button>
                    </div>
                </div>
                <div class="form-group">
                </div>
            </form>
        </div>

       
    </body>
</html>
