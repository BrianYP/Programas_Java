import javax.swing.*;
import java.util.*;
public class operaciones {
    //CONCEPTOS
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //METODOS
    public void pedirDatos(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero"));
    }

    public void suma(){
        suma = numero1+numero2;
    }
    public void resta(){
        resta = numero1-numero2;
    }
    public void multiplicacion(){
        multiplicacion = numero1*numero2;
    }
    public void division(){
        division = numero1/numero2;
    }
    public void mostrarInfo(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("El resultado de la división es: "+division);
    }
}
