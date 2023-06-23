import javax.swing.*;

public class Empleado extends Departamento {
    private String nombre;
    private int edad;
    private double sueldo;

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

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}