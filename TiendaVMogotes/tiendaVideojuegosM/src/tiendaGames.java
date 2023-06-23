//importaciones
import javax.swing.*;
import java.util.Arrays;

public class tiendaGames {
    public static void main(String[] args) {
        int opcion, cantdadG, est, cantidad2=0;
        boolean estado = false;
        String juegoAElim, juegoACambiar;
        videoJuego vect[] = new videoJuego[100];
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("------Bienvenido a la tienda GamesMogotes----\n"+
                    "1.Insertar y Registrar un Videojuegos\n"+
                    "2.Borrar un videoJuego\n"+
                    "3.Modificar un videoJuegos\n"+
                    "4.Ver lista de Juegos\n"+
                    "5.Ver ranking de videoJuegos\n"+
                    "6.Salir"));
            switch (opcion){//para las operaciones que se desean hacer
                case 1:
                    cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de juegos que va a insertar"));
                    if(cantidad2<1){
                        JOptionPane.showMessageDialog(null, "No se puede ingresar esa cantidad de juegos", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{//De esta manera creamos un nuevo vector actualizando la cantidad de juegos que se van a insertar como nuevos
                        videoJuego[] nuevoVect = Arrays.copyOf(vect, vect.length + cantidad2);
                        for(int i=vect.length; i<nuevoVect.length; i++){
                            videoJuego game1 = new videoJuego();
                            game1.setTitulo(JOptionPane.showInputDialog("Ingrese el Titulo del juego ["+(i+1)+"]"));
                            game1.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas del juego")));
                            game1.setGenero(JOptionPane.showInputDialog("Ingrese el genero del juego"));
                            game1.setCampana(JOptionPane.showInputDialog("Ingrese la compañia del juego"));
                            boolean nuevoEstado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el nuevo estado del juego\n(true para prestado, false para no prestado): "));
                            game1.cambiarEstado(nuevoEstado);
                            nuevoVect[i] = game1;
                        }
                        JOptionPane.showMessageDialog(null, "Juego(s) insertado(s) con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        vect = nuevoVect;
                    }
                    break;
                case 2:
                    videoJuego game3 = new videoJuego();
                    juegoAElim = JOptionPane.showInputDialog("Ingrese el Titulo del juego que desea eliminar");
                    game3.eliminarJuego(vect, juegoAElim);
                    break;
                case 3:
                    videoJuego game4 = new videoJuego();
                    juegoACambiar = JOptionPane.showInputDialog("Ingrese el nombre del juego que desea Modificar");
                    game4.modificarGame(vect, juegoACambiar);
                    break;
                case 4:
                    videoJuego game5 = new videoJuego();
                    game5.verJuegos(vect);
                    break;
                case 5:
                    videoJuego game6 = new videoJuego();
                    game6.rankingPorHoras(vect);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Mesaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Eliga una opción que este contemplada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }

        }while (opcion!=6);
    }
}
