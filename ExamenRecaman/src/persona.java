public class persona {
    private String nombreC;
    private String apellidoC;
    private String cedulaC;
    private String telefonoC;
    private String direccionC;


    public persona(String nombreC, String apellidoC, String cedulaC, String telefonoC, String direccionC){
        this.nombreC = nombreC;
        this.apellidoC = apellidoC;
        this.cedulaC = cedulaC;
        this.telefonoC = telefonoC;
        this.direccionC = direccionC;
    }


    public String getNombreC(){//NOMBRE DEL CLIENTE-----------------------------------------------------
        return nombreC;
    }
    public void setNombreC(String nombreC){
        this.nombreC = nombreC;
    }

    public String getApellidoC(){//APELLIDO DEL CLIENTE (USUARIO)---------------------------------------
        return apellidoC;
    }
    public void setApellidoC(String apellidoC){
        this.apellidoC = apellidoC;
    }

    public String getCedulaC(){//CEDULA DEL USUARIO-----------------------------------------------------
        return cedulaC;
    }
    public void setCedulaC(String cedulaC){
        this.cedulaC = cedulaC;
    }

    public String getTelefonoC(){//TELEFONO DEL USUARIO.................................................
        return telefonoC;
    }
    public void setTelefonoC(String telefonoC){
        this.telefonoC = telefonoC;
    }

    public String getDireccionC(){
        return direccionC;
    }
    public void setDireccionC(String direccionC){
        this.direccionC = direccionC;
    }

}
