package listaempresa;
import java.util.Scanner;

public class ListaEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion;

        do {
            String menu = "\u001B[31m********** Menú de selección **********\n\u001B[0m"
                    + "\u001B[31m1. \u001B[0m\u001B[34mInsertar al Empleado\n"
                    + "\u001B[31m2. \u001B[0m\u001B[34mBuscar Empleado\n\u001B[0m"
                    + "\u001B[31m3. \u001B[0m\u001B[34mPromedio salario por estrato\n\u001B[0m"
                    + "\u001B[31m4. \u001B[0m\u001B[34mEliminar empleado por cedula\n\u001B[0m"
                    + "\u001B[31m5. \u001B[0m\u001B[34mAumento salarial\n\u001B[0m"
                    + "\u001B[31m6. \u001B[0m\u001B[34mImprimir lista\n\u001B[0m"
                    + "\u001B[31m7. \u001B[0m\u001B[34mSalir\n\n\u001B[0m"
                    + "\u001B[34mIngrese su opción:\u001B[0m";
            System.out.print(menu);
            opcion = obtenerEntero();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cedula del empleado: ");
                    String cedula = obtenerTexto();
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = obtenerTexto();
                    System.out.print("Ingrese el salario basico del empleado: ");
                    double salario_basico = obtenerDouble();
                    System.out.print("Ingrese el estrato del empleado: ");
                    int estrato = obtenerEntero();
                    System.out.print("Ingrese la direccion del empleado: ");
                    String direccion = obtenerTexto();
                    System.out.print("Ingrese el telefono del empleado: ");
                    String telefono = obtenerTexto();

                    lista.IngresarEmpleado(cedula, nombre, salario_basico, estrato, direccion, telefono);
                    System.out.println("Empleado insertado.");
                    break;
                case 2:
                    System.out.print("Ingrese la cedula del empleado: ");
                    String ced = obtenerTexto();
                    System.out.println("\n");
                    System.out.println(lista.buscarEmpleado(ced));
                    break;
                case 3:
                    System.out.println(lista.promedioSalario());
                    break;
                case 4:
                    System.out.print("Ingrese la cedula del empleado: ");
                    String ce = obtenerTexto();
                    lista.eliminarPorCedula(ce);
                    System.out.println("Empleado eliminado");
                    break;
                case 5:
                    System.out.print("Ingrese el aumento de salario: ");
                    double salario_basic = obtenerDouble();
                    lista.aumentoSalarial(salario_basic);
                    System.out.println("Salario aumentado");
                    break;
                case 6:
                    System.out.println("Lista: \n" + lista.imprimirLista());
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        } while (opcion != 7);
    }


    private static int obtenerEntero() {
        Scanner scanner = new Scanner(System.in);
        int entero = scanner.nextInt();
        scanner.nextLine();
        return entero;
    }


    private static double obtenerDouble() {
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        scanner.nextLine();
        return numero;
    }


    private static String obtenerTexto() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
