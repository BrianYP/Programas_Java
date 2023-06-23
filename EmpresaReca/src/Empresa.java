import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Empresa extends Departamento {
    private String nombreEmpre;
    private int nit;
    private String direccon;
    private List<Empleado> listaEmpleados;

    //------------------------------------CONSTRUCTORES
    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

    public Empresa(String nombreDepart, String nombreEmpre, int nit, String direccon) {
        super(nombreDepart);
        this.nombreEmpre = nombreEmpre;
        this.nit = nit;
        this.direccon = direccon;
        listaEmpleados = new ArrayList<>();
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

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //------------------------------------------------------------METODOS
    public void modificarEmpleado(String nombreEmpleado, String nuevoNombre, int nuevaEdad, float nuevoSueldo) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equals(nombreEmpleado)) {
                empleado.setNombre(nuevoNombre);
                empleado.setEdad(nuevaEdad);
                empleado.setSueldo(nuevoSueldo);
                break;
            }
        }
    }


    public void eliminarEmpleado(String nombreEmpleado) {
        try {
            File archivoEmpleados = new File("empleados.txt");
            ArrayList<String> listaEmpleados = new ArrayList<>();
            BufferedReader lector = new BufferedReader(new FileReader(archivoEmpleados));
            String linea;

            while ((linea = lector.readLine()) != null) {
                listaEmpleados.add(linea);
            }
            lector.close();

            boolean encontrado = false;
            for (int i = 0; i < listaEmpleados.size(); i++) {
                String[] datos = listaEmpleados.get(i).split(",");
                if (datos[0].equals(nombreEmpleado)) {
                    listaEmpleados.remove(i);
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoEmpleados));
                for (String empleado : listaEmpleados) {
                    escritor.write(empleado + "\n");
                }
                escritor.close();
                System.out.println("El empleado " + nombreEmpleado + " fue eliminado exitosamente.");
            } else {
                System.out.println("No se encontró al empleado " + nombreEmpleado + ".");
            }

        } catch (IOException e) {
            System.out.println("Error al eliminar el empleado.");
            e.printStackTrace();
        }
    }

    public double promedioSueldo() {
        double sumaSueldos = 0;
        for (Empleado empleado : listaEmpleados) {
            sumaSueldos += empleado.getSueldo();
        }
        return sumaSueldos / listaEmpleados.size();
    }

    public void mostrarDatosEmpre(){
        String nombre = "Inversiones Otraparte";
        String NIT = "125478512-6";
        String direccion = "Carrera 25 No 38 – 52";
        System.out.println("Datos de la empresa:\n"+
                "Nombre de la empresa: "+nombre+"\nNIT de la Empresa: "+NIT+"\nDirección de la Empresa: "+direccion+"\n");
    }
}
