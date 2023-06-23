import javax.swing.*;

public class Departamento {
    private String nombreDepart;
    private int cantidadDepart;
    private int numeroPer;
    ;
    //------------------------------------CONSTRUCTORES

    public Departamento() {
    }

    public Departamento(String nombreDepart, int cantidadDepart, int numeroPer) {
        this.nombreDepart = nombreDepart;
        this.cantidadDepart = cantidadDepart;
        this.numeroPer = numeroPer;
    }

    public Departamento(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }
    //------------------------------------USO DE SETTERS AND GETTERS

    public String getNombreDepart() {
        return nombreDepart;
    }

    public int getCantidadDepart() {
        return cantidadDepart;
    }

    public int getNumeroPer() {
        return numeroPer;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public void setCantidadDepart(int cantidadDepart) {
        this.cantidadDepart = cantidadDepart;
    }

    public void setNumeroPer(int numeroPer) {
        this.numeroPer = numeroPer;
    }
}
