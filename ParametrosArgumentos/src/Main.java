import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //VARIABLES PARA LAS OPERACIONES
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero"));

        operaciones op = new operaciones();//CREAMOS OBJETOS DE LA CLASE OPERACIONES
        op.suma(n1, n2);//PASAMOS LOS ARGUMENTOS LO CUALES SON LAS VARIABLES
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
        op.mostrarResultados();
    }
}