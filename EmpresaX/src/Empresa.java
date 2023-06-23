import javax.swing.*;

public class Empresa extends Departamento{
    private String nombreEmpre;
    private int nit;
    private String direccon;
    //------------------------------------CONSTRUCTORES
    public Empresa(){

    }
    public Empresa(String nombreDepart, String nombreEmpre, int nit, String direccon){
        super(nombreDepart);
        this.nombreEmpre=nombreEmpre;
        this.nit=nit;
        this.direccon=direccon;
    }
    //------------------------------------SETTERS AND GETTERS

    public String getNombreEmpre() {
        return nombreEmpre;
    }

    public void setNombreEmpre(String nombreEmpre) {
        this.nombreEmpre = nombreEmpre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccon() {
        return direccon;
    }

    public void setDireccon(String direccon) {
        this.direccon = direccon;
    }

    //------------------------------------METODOS
    public void datosEmpresa(){
        Empresa empre = new Empresa();
        String nombre1 = "Inversiones Otraparte";
        int nit1 = 125478512;
        String direccion1 = "Carrera 25 No 38 – 52";
        empre.setNombreEmpre(nombre1);
        empre.setNit(nit1);
        empre.setDireccon(direccion1);

        JOptionPane.showMessageDialog(null, "Nombre de la empresa: "+empre.getNombreEmpre()+"\nNIT de la empresa: "+empre.getNit()+"-6"+
                "\nDirección de la empresa: "+empre.getDireccon()+"");

    }

}
