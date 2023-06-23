import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("--Bienvenido a PETS S.A.S--");
        System.out.print("1.Registrarse\n2.Ingresar\n3.Salir\nSeleccione una opción: ");
        opcion = entrada.nextInt();

        validacion(opcion);

    }
    public static void validacion(int opcion) {
        Scanner entrada1 = new Scanner(System.in);
        String usuari = "";
        String contra = "";
        boolean empezar = true;

        while (empezar) {
            switch (opcion) {
                case 1:
                    System.out.println("Para registrarte en la aplicación requerimos de los siguientes datos");
                    System.out.print("Por favor ingrese un usuario: ");
                    usuari = entrada1.nextLine();

                    System.out.print("Por favor ingrese una contraseña: ");
                    contra = entrada1.nextLine();

                    System.out.println("Menu");
                    System.out.print("1. Registrarse\n2. Ingresar\n3. Salir\nSeleccione una opción: ");
                    opcion = entrada1.nextInt();
                    entrada1.nextLine(); // para consumir el carácter de nueva línea pendiente
                    break;
                case 2:
                    System.out.println("Ingrese los datos solicitados");
                    System.out.print("Ingrese su usuario: ");
                    String usuariV = entrada1.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    String contraV = entrada1.nextLine();

                    if (usuariV.equals(usuari) && contraV.equals(contra)) {
                        datosG G = new datosG();
                        G.datoss();

                        System.out.println("Menu");
                        System.out.print("1.Registrarse\n2.Ingresar\n3.Salir\nSeleccione una opción: ");
                        opcion = entrada1.nextInt();
                        break;

                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }

                    System.out.println("Menu");
                    System.out.print("1. Registrarse\n2. Ingresar\n3. Salir\nSeleccione una opción: ");
                    opcion = entrada1.nextInt();
                    entrada1.nextLine(); // para consumir el carácter de nueva línea pendiente
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    empezar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    System.out.println("Menu");
                    System.out.print("1. Registrarse\n2. Ingresar\n3. Salir\nSeleccione una opción: ");
                    opcion = entrada1.nextInt();
                    entrada1.nextLine(); // para consumir el carácter de nueva línea pendiente
                    break;
            }
        }
    }
}