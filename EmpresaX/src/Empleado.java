import javax.swing.*;

public class Empleado extends Departamento{
    private String nombre;
    private int edad;
    private double sueldo;
    Empresa vectEmple[];
    //----------------------------------------------------CONSTRUCTORES
    public Empleado() {
    }
    public Empleado(String nombreDepart, String nombre, int edad, double sueldo) {
        super(nombreDepart);
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    //----------------------------------------------------USO DE SETTERS AND GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa[] getVectEmple() {
        return vectEmple;
    }

    public void setVectEmple(Empresa[] vectEmple) {
        this.vectEmple = vectEmple;
    }
    //---------------------------------------------------------------METODOS
    public void borarEmple(Empleado vectEmple[], String nombreEmple){
        int posAElim = -1;
        for(int i=0; i< vectEmple.length;i++){
            if(vectEmple[i] !=null && vectEmple[i].getNombre().equals(nombreEmple)){
                posAElim = i;
                break;
            }
        }

        if(posAElim !=-1){
            for(int i=posAElim+1; i<vectEmple.length;i++){
                vectEmple[i-1] = vectEmple[i];
            }
            vectEmple[vectEmple.length-1] = null;
            JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "EL EMPLEADO NO SE HA ENCONTRADO", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public double promedioSueldo(Empleado vectEmple[]){
        double sumSueldo = 0;
        int numEmpleados = 0;
        for(int i=0; i< vectEmple.length;i++){
            if(vectEmple[i] !=null){
                sumSueldo += vectEmple[i].getSueldo();
                numEmpleados++;
            }
        }

        if (numEmpleados == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY EMPLEADOS.", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            return 0;
        } else {
            double promedio = sumSueldo / numEmpleados;
            JOptionPane.showMessageDialog(null, "El promedio del sueldo de los empleados es: " + promedio, "PROMEDIO", JOptionPane.INFORMATION_MESSAGE);
            return promedio;
        }
    }

    public void verEmpleados(Empleado vectEmple[]) {
        String empleados = "";
        boolean empleadosBorrados = false;
        for(int i = 0; i < vectEmple.length; i++) {
            if(vectEmple[i] != null) {
                empleados += "Nombre: " + vectEmple[i].getNombre() + "\nEdad: " + vectEmple[i].getEdad() + "\nSueldo: " + vectEmple[i].getSueldo() + "\nDepartamento: " + vectEmple[i].getNombreDepart() + "\n\n";
            } else {
                empleadosBorrados = true;
            }
        }
        if(!empleadosBorrados) {
            JOptionPane.showMessageDialog(null, empleados, "EMPLEADOS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, empleados + "\n(NO SE MOSTRARAN EMPLEADOS BORRADOS)", "EMPLEADOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
