import javax.swing.*;
import java.util.*;
public class menuDesple {
    Scanner entrada = new Scanner(System.in);
    Metodos mt = new Metodos();
    int opcion;
    public void MenuDesplegable(){
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog( "----- MOGOTES STORE -----\n"+
                    "1.Insertar Juego al principio\n"+
                    "2.Insertar Juego al final\n"+
                    "3.Modificar game\n"+
                    "4.Buscar en lista desordenada\n"+
                    "5.Buscar en lista ordenada\n"+
                    "6.Contar Juegos\n"+
                    "7.Imprimir lista de Juegos\n"+
                    "8.Borrar por Referencia\n"+
                    "9.Ver ranking de juegos\n"+
                    "0.Salir\n"+
                    "Seleccione una opcion: "));
            switch(opcion){
                case 1:
                    insertP();
                    break;
                case 2:
                    insertF();
                    break;
                case 3:
                    String name = JOptionPane.showInputDialog("Ingrese el nombre del juego a modificar");
                    mt.modificarGame(name);
                    break;
                case 4:
                    buscarDesordenada();
                    break;
                case 5:
                    buscarOrdenada();
                    break;
                case 6:
                    contarGame();
                    break;
                case 7:
                    mt.imprimirLista();
                    break;
                case 8:
                    borrarRefe();
                    break;
                case 9:
                    mt.ranking();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar MogotesStore","Alerta", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no contemplada","Alerta", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        }while(opcion != 0);
        entrada.close();
    }


    public void insertP(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juego");
        String genero = JOptionPane.showInputDialog("Ingrese el genero del juego");
        String campana = JOptionPane.showInputDialog("Ingrese la compañia del juego");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas del juego"));
        boolean estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el nuevo estado del juego\n(true para prestado, false para no prestado)"));

        Nodo nuevo1 = new Nodo(nombre, genero, campana, horas, estado);
        mt.insertarPrincipio(nuevo1);
    }

    public void insertF(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juego");
        String genero = JOptionPane.showInputDialog("Ingrese el genero del juego");
        String campana = JOptionPane.showInputDialog("Ingrese la compañia del juego");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas del juego"));
        boolean estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el nuevo estado del juego\n(true para prestado, false para no prestado)"));

        Nodo nuevo1 = new Nodo(nombre, genero, campana, horas, estado);
        mt.insertarFinal(nuevo1);
    }

    public void buscarDesordenada(){
        String conteRefe = JOptionPane.showInputDialog("Ingrese nombre del juego a buscar");
        Nodo encontrador = mt.buscarListaDesordenada(conteRefe);

        if(encontrador !=null){
            JOptionPane.showMessageDialog(null, "El juego se encontro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El juego no encontro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void buscarOrdenada(){
        String conteRefe = JOptionPane.showInputDialog("Ingrese nombre del juego a buscar");
        boolean encontrador = mt.buscarListaOrdenada(conteRefe);

        if(encontrador){
            JOptionPane.showMessageDialog(null, "El juego se encontro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El juego no encontro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void contarGame(){
        int numNodos = mt.contarNodo();
        JOptionPane.showMessageDialog(null, "El numero de juegos registrados es: "+numNodos,"Mesaje",JOptionPane.INFORMATION_MESSAGE);
    }

    public void borrarRefe(){
        String infoRefe = JOptionPane.showInputDialog("Ingrese el nombre del juego a borrar");
        boolean encontrador = mt.borarPorRefe(infoRefe);
        if(encontrador){
            JOptionPane.showMessageDialog(null, "El juego ha sido eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El juego no se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
