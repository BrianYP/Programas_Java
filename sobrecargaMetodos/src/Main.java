import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String nombreP = JOptionPane.showInputDialog("Introduzca su nomnbre");
        String dniP = JOptionPane.showInputDialog("Introduzca su DNI");
        int edadP = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad"));
        int kmP = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de kilometros recorridos"));

        persona p1 = new persona(nombreP, edadP);//Le pasamos los parametros de uno de los constrictores
        p1.correr();//En este caso solo llamamos al metodo correr sin parametros

        persona p2 = new persona(dniP);//Usamos el otro constrictor
        p2.correr(kmP);//Le indicamos la velocidad que recorre
    }
}