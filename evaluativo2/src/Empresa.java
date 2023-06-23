import java.util.ArrayList;

public class Empresa extends Departamento {
    private String nit;
    private String direccon;
    private ArrayList<Departamento> listaDepart;

    //------------------------------------CONSTRUCTORES

    public Empresa(String nombreDepart, int numeroPer, String nit, String direccon, String s) {
        super(nombreDepart, numeroPer);
        this.nit = nit;
        this.direccon = direccon;
        this.listaDepart = new ArrayList<Departamento>();
    }

    //------------------------------------SETTERS AND GETTERS
    public ArrayList<Departamento> getListaDepart(){
        return listaDepart;
    }
    //-----------------------------------------------------------------------
    public void agregarDepartamento(Departamento departamento) {
        listaDepart.add(departamento);
    }
    public int getCantidadPers(){
        int cantidadPersonas = 0;
        for(Departamento departamento : listaDepart){
            cantidadPersonas += departamento.getCantidadEmple();
        }
        return cantidadPersonas;
    }
    public float calcularPromeSueldoEmpre(){
        float totalSueldo = 0;
        int cantidadPersonas = getCantidadPers();
        for(Departamento departamento : listaDepart){
            for(Empleado empleado : departamento.getListaEmpleados()){
                totalSueldo += empleado.getSueldo();
            }
        }
        return totalSueldo/cantidadPersonas;
    }

}