public class Empleado extends Departamento {
    private String nombre;
    private int edad;
    private double sueldo;


    //----------------------------------------------------CONSTRUCTORES

    public Empleado(String nombreDepart, int edad, double sueldo) {
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

//---------------------------------------------------------------METODOS
}