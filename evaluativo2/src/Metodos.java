import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Metodos {
    String nombreEmpresa = "Inversiones Otraparte";
    String nitEmpresa = "125478512-6";
    String direccionEmpresa = "Carrera 25 No 38 - 52";
    int contador = 0;
    Empresa empresa = new Empresa("", 0, "Inversiones Otraparte", "125478512-6", "Carrera 25 No 38 - 52");
    Empleado empleado = new Empleado("",0,0);
    public void menuDesple() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido a Inversiones Otraparte!\n\n"
                    + "Por favor, seleccione una opción:\n"
                    + "1. Agregar Datos\n"
                    + "2. Salir\n\n"
                    + "Ingrese el número de su opción:"));

            switch (opcion) {
                case 1:
                    agregarDepartamento(empresa,empleado);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opcion != 2);
    }

    public void agregarDepartamento(Empresa empresa, Empleado empleado) {
        while (true) {

            String nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del departamento o 'salir' para terminar: ");

            if (nombreDepartamento.equalsIgnoreCase("salir")) {
                break;
            }

            Departamento departamento = new Departamento(nombreDepartamento);
            empresa.agregarDepartamento(departamento);

            while (true) {
                String nombrePersona = JOptionPane.showInputDialog("Ingrese el nombre de la persona o 'salir' para terminar: ");

                if (nombrePersona.equalsIgnoreCase("salir")) {
                    break;
                }

                int edadP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                double sueldoP = Double.parseDouble (JOptionPane.showInputDialog("Ingrese el sueldo de la persona: "));


                empleado = new Empleado(nombrePersona, edadP, sueldoP);
                departamento.agregarEmple(empleado);
                contador++;
            }
        }


        double promedioSueldoEmpresa = empresa.calcularPromeSueldoEmpre();
        JOptionPane.showMessageDialog(null, "El promedio de sueldo de la empresa es: " + promedioSueldoEmpresa+"\n"+
                "Cantidad de personas en la empresa: " + contador, "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("informacion.txt"));
            writer.write("Información de la empresa\n");
            writer.write("Nombre: " + nombreEmpresa + "\n");
            writer.write("NIT: " + nitEmpresa + "\n");
            writer.write("Dirección: " + direccionEmpresa + "\n");
            writer.write("\n");

            for (Departamento departamento : empresa.getListaDepart()) {
                double promedioSueldoDepartamento = departamento.calcularPromDepart();
                JOptionPane.showMessageDialog(null, "El promedio de sueldo del departamento " + departamento.getNombreDepart() + " es: " + promedioSueldoDepartamento+"\n"+
                        "Cantidad de personas en el departamento " + departamento.getNombreDepart() + ": " + departamento.getCantidadEmple(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                writer.write("Información del departamento " + departamento.getNombreDepart()+ "\n");
                writer.write("Cantidad de personas: " + departamento.getCantidadEmple() + "\n");
                writer.write("Promedio de sueldo: " + promedioSueldoDepartamento + "\n");

                for (Empleado  empleado1 : departamento.getListaEmpleados()) {
                    writer.write("Nombre de la persona: " + empleado1.getNombre() + "\n");
                    writer.write("Edad de la persona: " + empleado1.getEdad()+ "\n");//no imprimia
                    writer.write("Sueldo de la persona: " + empleado1.getSueldo() + "\n"+"\n");
                }

                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                    e.printStackTrace();
                }
            }

        String informacion = "";
        try {
            File archivo = new File("informacion.txt");
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                informacion += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, informacion);
    }
    }

}