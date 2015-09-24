
function revisarObligatorio(elemento) {

    if (elemento.value == "") {
        $("#" + elemento.id).parent().parent().addClass("has-error")
        //elemento.style.borderColor = "red";
    }
    else
    {
        $("#" + elemento.id).parent().parent().removeClass("has-error");               
        //elemento.style.borderColor = "blue";
    }
}

//valida cuando se oprime el boton 
function validarCampos(ids)
{
    var estaTodoOk = true;

    for (x = 0; x < ids.length; x++) {

        //alert(document.getElementById(cars[x]).value);
        if ($(ids[x]).find("input").val() == "") {
            $(ids[x]).addClass("has-error")
            //document.getElementById(cars[x]).style.borderColor = "red";
            estaTodoOk = false;
        }                
    }

    if (!estaTodoOk) {
        toastr.error("Llene los campos obligatorios");
        //alert("Llene los campos obligatorios");
    }

    return estaTodoOk;
}

function validarRegistrado(elemento,Controlador)
{                                                        
    $.ajax({
    type: 'POST',
    url: Controlador,
    data: {parametroControlador: elemento.value},                                                 
    success: function(result){                                
            if (result == elemento.value && elemento.value != "") {
                //alert("este registro ya esta existe")
                toastr.warning(elemento.value+" ya esta existe");
                elemento.focus();
                elemento.value = "";
            }            
        }
    });                                      
}    

function validarNoRegistrado(elemento,Controlador)
{                                                        
    $.ajax({
    type: 'POST',
    url: Controlador,
    data: {parametroControlador: elemento.value},                                                 
    success: function(result){                                
            if (result != elemento.value) {
                toastr.warning(elemento.value+" no existe");
                //alert("este registro no esta registrado")
                elemento.value = "";
            }            
        }
    });                                      
}    