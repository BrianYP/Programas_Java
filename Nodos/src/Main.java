import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaLSE lista = new ListaLSE();
        int opcion;
        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1.Insertar nodo al principio");
            System.out.println("2.Insertar nodo al final");
            System.out.println("3.Insertar nodo por referencia");
            System.out.println("4.Buscar en lista desordenada");
            System.out.println("5.Buscar en lista ordenada");
            System.out.println("6.Contar nodos");
            System.out.println("7.Imprimir lista");
            System.out.println("8.Borar por Referencia");
            System.out.println("9.Borar la punta de Lista");
            System.out.println("10.Borrar la ultima punta");
            System.out.println("11.Borar por Referencia");
            System.out.println("0.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el contenido del nodo: ");
                    String contenido = sc.next();
                    Nodo nuevo1 = new Nodo(contenido);
                    lista.InsertarAPrincipio(nuevo1);
                    break;
                case 2:
                    System.out.print("Ingrese el contenido del nodo: ");
                    String contenido2 = sc.next();
                    Nodo nuevo2 = new Nodo(contenido2);
                    lista.InsertarAFinal(nuevo2);
                    break;
                case 3:
                    System.out.print("Ingrese el contenido del nodo: ");
                    String contenido3 = sc.next();
                    Nodo nuevo3 = new Nodo(contenido3);
                    System.out.print("Ingrese el contenido de referencia: ");
                    String contenidoRef = sc.next();
                    lista.InsertarPorRefe(nuevo3, contenidoRef);
                    break;
                case 4:
                    System.out.print("Ingrese el contenido a buscar: ");
                    String contenido4 = sc.next();
                    Nodo encontrado = lista.buscarListaDesordenada(contenido4);
                    if (encontrado != null) {
                        System.out.println("Nodo encontrado: " + encontrado.getContenido());
                    } else {
                        System.out.println("No se encontró el nodo.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el contenido a buscar: ");
                    String contenido5 = sc.next();
                    boolean encontrado2 = lista.buscarListaOrdenada(contenido5);
                    if (encontrado2) {
                        System.out.println("Se encontró el nodo.");
                    } else {
                        System.out.println("No se encontró el nodo.");
                    }
                    break;
                case 6:
                    int numNodos = lista.contarNodos();
                    System.out.println("El número de nodos en la lista es: " + numNodos);
                    break;
                case 7:
                    lista.imprimirLista();
                    break;
                case 8:
                    System.out.print("Ingrese el nodo que va a borrar: ");
                    String infoRefe = sc.next();
                    boolean encontrado3 = lista.borrarPorReferencia(infoRefe);
                    if (encontrado3){
                        System.out.println("El nodo ha sido eliminado");
                    }
                    else{
                        System.out.println("El nodo no se ha eliminado");
                    }
                    break;
                case 9:
                    lista.borrarListaLSEPunta();
                    break;
                case 10:
                    lista.borrarListaLSEUltimo();
                    break;
                case 11:
                    System.out.print("Ingrese la posición del nodo: ");
                    int pos = sc.nextInt();
                    boolean encontrado4 = lista.borrarPorPosicion(pos);
                    if(encontrado4){
                        System.out.println("El nodo ha sido eliminado");
                    }
                    else{
                        System.out.println("El nodo no ha sido eliminado");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println("");
        } while (opcion != 0);
        sc.close();
    }
}
