import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero: "));

        operaciones op = new operaciones();
        //Creamos los objetos de la clase operaciones y de esta manera los llamamos
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult = op.multiplicacion(n1, n2);
        int div = op.division(n1, n2);
        //Como se puede ver, creamos otra variable del mismo tipo y la asignamos con el objeto

        op.mostrarDatos(suma, resta, mult, div);//Mostramos la info con los parametros
    }
}