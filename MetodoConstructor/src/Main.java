import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introcuzca su nomnbre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introcuzca su edad"));
        String nombreMac = JOptionPane.showInputDialog("Introcuzca su nomnbre de su mascota");
        int edadMac = Integer.parseInt(JOptionPane.showInputDialog("Introcuzca la edad de su mascota"));


        persona p1 = new persona(nombre, edad);//Instranciamos objetos
        p1.mostrarDatos();//Mostramos datos

        mascota m1 = new mascota(nombreMac, edadMac);
        m1.mostrarDatoss(nombreMac, edadMac);
        //De esta manera mostramos los datos de la mascota

    }
}