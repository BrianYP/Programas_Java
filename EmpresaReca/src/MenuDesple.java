import java.util.Scanner;
import java.util.ArrayList;

public class MenuDesple {
    public static Scanner scanner = new Scanner(System.in);
    public static Empresa empresa = new Empresa();
    public static ArrayList<Departamento> departamentos;
    public static ArrayList<Empleado> empleados;

    public static void mostrarMenu() {
        departamentos = ArchivosPlanos.cargarDepart();
        if (departamentos == null) {
            departamentos = new ArrayList<>();
        }

        empleados = ArchivosPlanos.cargarEmpleado();
        if (empleados == null) {
            empleados = new ArrayList<>();
        }

        boolean salir = false;
        while (!salir) {
            System.out.print("Menú de opciones:\n"+
                    "1.Ver Información de la Empresa\n"+
                    "2.Agregar Departamentos\n"+
                    "3.Ver Departamento\n"+
                    "4.Agregar Empleados\n"+
                    "5.Ver Empleados\n"+
                    "6.Modificar Empleado\n"+
                    "7.Eliminar Empleado\n"+
                    "8.Promedio Sueldo\n"+
                    "9.Salir\n"+
                    "Ingrese una Opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    empresa.mostrarDatosEmpre();
                    break;
                case 2:
                    agregarDepartamento();
                    break;
                case 3:
                    mostrarDepartamentos();
                    break;
                case 4:
                    agregarEmpleado();
                    break;
                case 5:
                    mostrarEmpleados();
                    break;
                case 6:
                    modi();
                    break;
                case 7:
                    String nombreB;
                    System.out.print("Ingrese el nombre del empleado a eliminar: ");
                    nombreB = scanner.nextLine();
                    empresa.eliminarEmpleado(nombreB);
                    break;
                case 8:
                    empresa.promedioSueldo();
                    break;
                case 9:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
        scanner.close(); // cierra el scanner al finalizar
        System.exit(0); // termina el programa
    }

    public static void mostrarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("No se encontraron departamentos.");
            return;
        }
        System.out.println("Departamentos:");
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }

    public static void agregarDepartamento() {
        Departamento departamento = new Departamento();
        System.out.print("Ingrese el nombre del departamento: ");
        departamento.setNombreDepart(scanner.nextLine());
        System.out.print("Ingrese la cantidad de personas en el departamento: ");
        departamento.setCantidadDepart(Integer.parseInt(scanner.nextLine()));
        System.out.print("Ingrese el número de personal del departamento: ");
        departamento.setNumeroPer(Integer.parseInt(scanner.nextLine()));
        departamentos.add(departamento);
        ArchivosPlanos.guardarDepartament(departamentos);
        System.out.println("Departamento agregado exitosamente.");
    }

    public static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No se encontraron empleados.");
            return;
        }
        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static void agregarEmpleado(){
        Empleado emple = new Empleado();
        System.out.print("Ingrese el nombre del empleado: ");
        emple.setNombre(scanner.nextLine());
        System.out.print("Ingrese la edad del empleado: ");
        emple.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.print("Ingrese el sueldo del empleado: ");
        emple.setSueldo(Float.parseFloat(scanner.nextLine()));
        empleados.add(emple);
        ArchivosPlanos.guardaeEmpleado(empleados);
        System.out.println("Empleado agregado con exito");
    }

    public static void modi(){
        String nombreBus, nombreN;
        int edad;
        float sueldo;
        System.out.print("Ingrese el nombre del empleado a modificar: ");
        nombreBus = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del empleado");
        nombreN = scanner.nextLine();
        System.out.print("Ingrese la nueva edad del empleado");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el sueldo del nuevo empleado: ");
        sueldo = Float.parseFloat(scanner.nextLine());

        empresa.modificarEmpleado(nombreBus, nombreN, edad, sueldo);
    }


}

