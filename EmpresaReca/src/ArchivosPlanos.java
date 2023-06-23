import java.io.*;
import java.util.ArrayList;
public class ArchivosPlanos {
    public static final String Departamento_File = "Departamento.txt";
    public static final String Empleado_File = "Empleado.txt";

    //--------------------------------------------------------METODOS

    public static  void guardarDepartament(ArrayList<Departamento> depart){//Escribimos los datos del departamento
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter(Departamento_File));
            for(Departamento departamento : depart){
                escribir.write(departamento.getNombreDepart()+","+departamento.getCantidadDepart()+","+departamento.getNumeroPer()+"\n");
            }
            escribir.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Departamento> cargarDepart(){
        try {
            BufferedReader leer = new BufferedReader(new FileReader(Departamento_File));
            ArrayList<Departamento> departamentos = new ArrayList<>();
            String line;
            while((line = leer.readLine()) !=null){
                String[] dato = line.split(",");
                Departamento depart = new Departamento(dato[0], Integer.parseInt(dato[1]), Integer.parseInt(dato[2]));
                departamentos.add(depart);
            }
            leer.close();
            return departamentos;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void guardaeEmpleado(ArrayList<Empleado> empleados) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Empleado_File));
            for (Empleado empleado : empleados) {
                writer.write(empleado.getNombreDepart() + "," + empleado.getNombre() + "," + empleado.getEdad() + "," + empleado.getSueldo() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Empleado> cargarEmpleado(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Empleado_File));
            ArrayList<Empleado> empleados = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Empleado empleado = new Empleado(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
                empleados.add(empleado);
            }
            reader.close();
            return empleados;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
