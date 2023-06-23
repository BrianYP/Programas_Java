public class medicamentos {
    private String nombreDisis;
    private String descripcionDosis;
    private String dosis;


    public medicamentos(String nombreDisis, String descripcionDosis, String dosis){
        this.nombreDisis = nombreDisis;
        this.descripcionDosis = descripcionDosis;
        this.dosis = dosis;
    }


    public String getNombreDisis(){//NOMBRE DE LA DOSIS------------------------------------------
        return nombreDisis;
    }
    public void setNombreDisis(String nombreDisis){
        this.nombreDisis = nombreDisis;
    }

    public String getDescripcionDosis(){//DESCRIPCIÓN DE LA DOSIS------------------------------
        return descripcionDosis;
    }
    public void setDescripcionDosis(String descripcionDosis){
        this.descripcionDosis = descripcionDosis;
    }

    public String getDosis(){//LA DOSIS QUE SE LE DA A LA MASCOTA----------------------------------
        return dosis;
    }
    public void setDosis(String dosis){
        this.dosis = dosis;
    }
}
