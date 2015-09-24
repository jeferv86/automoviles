
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Recuperar contraseña</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="shortcut icon" href="img/favicon.ico" />

        <!-- bootstrap -->
        <link href="css/bootstrap.css" rel="stylesheet" />
        <link href="css/bootstrap-datepicker.min.css" type="text/css" rel="stylesheet" />


        <!-- libraries -->
        <link rel="stylesheet" type="text/css" href="css/lib/font-awesome.css" />
        <link href="css/lib/toastr.css" rel="stylesheet" type="text/css"/>
       
        <link rel="stylesheet" href="css/compiled/signin.css" type="text/css" media="screen" />
    </head>
    <body>
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <strong> Ingrese su correo para recuperar</strong>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="#" method="POST">
                            <fieldset>
                                <div class="row">
                                    <div class="center-block">
                                        <img class="profile-img"
                                             src="">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-user"></i>
                                                </span> 
                                                <input class="form-control" placeholder="Correo" name="usuLogin" type="email" autofocus>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Reestablecer" name="btnRecuperar">
                                        </div>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>                    
                </div>
            </div>
        </div>
    </body>
</html>
