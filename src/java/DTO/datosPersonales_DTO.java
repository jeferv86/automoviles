package DTO;

public class datosPersonales_DTO {
    
    private int daTid;
    private int datUsuId;
    private String datNombre;
    private String datApellido;
    private String daTipoId;        
    private String datNumeroId;
    private String daTelefono;        
    private String datCorreo;      
    private vehiculo_DTO vehiculo;

    public vehiculo_DTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo_DTO vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public int getDaTid() {
        return daTid;
    }

    public void setDaTid(int daTid) {
        this.daTid = daTid;
    }

    public String getDatNombre() {
        return datNombre;
    }

    public void setDatNombre(String datNombre) {
        this.datNombre = datNombre;
    }

    public String getDatApellido() {
        return datApellido;
    }

    public void setDatApellido(String datApellido) {
        this.datApellido = datApellido;
    }

    public String getDaTipoId() {
        return daTipoId;
    }

    public void setDaTipoId(String daTipoId) {
        this.daTipoId = daTipoId;
    }

    public String getDatNumeroId() {
        return datNumeroId;
    }

    public void setDatNumeroId(String datNumeroId) {
        this.datNumeroId = datNumeroId;
    }

    public String getDaTelefono() {
        return daTelefono;
    }

    public void setDaTelefono(String daTelefono) {
        this.daTelefono = daTelefono;
    }

    public String getDatCorreo() {
        return datCorreo;
    }

    public void setDatCorreo(String datCorreo) {
        this.datCorreo = datCorreo;
    }


    public int getDatUsuId() {
        return datUsuId;
    }

    public void setDatUsuId(int datUsuId) {
        this.datUsuId = datUsuId;
    }
   }
