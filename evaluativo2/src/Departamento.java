import java.util.ArrayList;

public class Departamento {
    private String nombreDepart;
    private ArrayList<Empleado> listaEmpleados;
    //------------------------------------CONSTRUCTORES
    public Departamento(String nombreDepart, int cantidadDepart) {
        this.nombreDepart = nombreDepart;
        this.listaEmpleados = new ArrayList<Empleado>();
    }

    public Departamento(String nombreDepart) {
        this.nombreDepart = nombreDepart;
        this.listaEmpleados = new ArrayList<Empleado>();
    }
    //------------------------------------USO DE SETTERS AND GETTERS

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    //--------------------------------------------------------------------------
    public void agregarEmple(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    public int getCantidadEmple(){
        return listaEmpleados.size();
    }

    public double calcularPromDepart(){
        double totalSueldos = 0;
        int cantidadDeEmple = getCantidadEmple();
        for(Empleado empleado : listaEmpleados){
            totalSueldos += empleado.getSueldo();
        }
        return totalSueldos/cantidadDeEmple;
    }
}
