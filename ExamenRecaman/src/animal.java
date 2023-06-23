public class animal {
    private String nombre;
    private String raza;
    private String edad;
    private String peso;
    private String identificacion;


    public animal(String nombre, String raza, String edad, String peso, String identificacion){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.identificacion = identificacion;
    }


    public String getNombre(){//LEER EL VALOR PARA MOSTRARLO U OPERARLO---------------------------------
        return nombre;
    }
    public void setNombre(String nombre){//ASIGNAMOS UN VALOR A NOMBRE
        this.nombre = nombre;
    }

    public String getRaza(){//LA RAZA DE LA MASCOTA------------------------------------------------
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getEdad() {//LA EDADAD DE LA MASCOTA-------------------------------------------------
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }

    public String getPeso(){//PESO DE LA MASCOTA---------------------------------------------------------
        return peso;
    }
    public void setPeso(String peso){
        this.peso = peso;
    }

    public String getIdentificacion(){//LA IDENTIFIACIÓN DE LA MASCOTA-----------------------------------
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
}
