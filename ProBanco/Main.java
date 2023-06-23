//importaciones
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String nombre, apellido, dni;
        Cuenta vect[];//Arreglo de cuentas por si el cliente tiene mas de ua cuenta
        Vector vector;
        int numeroCuenta, cantidadCuentas, opcion, indiceNCuentas;
        double saldo, cantidadDinero;

        nombre = JOptionPane.showInputDialog("---------------Bienvenido---------------"+
                "\nPor favor, ingrese su nombre");
        apellido = JOptionPane.showInputDialog("Por favor, ingrese su apellido");
        dni = JOptionPane.showInputDialog("Por favor, ingrese su DNI");
        cantidadCuentas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas cuentas tiene"));

        vect = new Cuenta[cantidadCuentas];//tamaño del vector que es igual a 100

        //Rellenamos el vector con las cuentas
        for(int i=0; i<vect.length; i++){
            System.out.println("\nDigite la cuenta ["+(i+1)+"]");
            numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Digite el NUMERO de su cuenta ["+(i+1)+"]"));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite el SALDO de la cuenta"));

            vect[i] = new Cuenta(numeroCuenta, saldo);
        }
        vector = new Vector(nombre, apellido, dni, vect);//Pasamos los parametros

        //CREAMOS EL MENU
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("------Bienvenido------\n"+
                    "1.Ingresar saldo de la cuenta\n"+
                    "2.Retirar saldo de la cuenta\n"+
                    "3.Consultar saldo de la cuenta\n"+
                    "4.Salir\n"+
                    "Seleccione una opción"));

            switch(opcion){//Usamos el switch para cada una de las opciones que seleccione el usuario
                case 1:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la cuenta"));
                    indiceNCuentas = buscarNCuentas(vect, numeroCuenta);
                    //Le pasamos el vector y el numero de la cuenta para que lo busque con el metodo

                    if(indiceNCuentas == -1){//NO SE ENCONTRO CUENTA
                        JOptionPane.showMessageDialog(null, "La cuenta no se ha encontrado", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        cantidadDinero = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de dinero a depositar"));
                        vector.ingresarDinero(indiceNCuentas, cantidadDinero);
                        //Le pedimos la cantidad de dinero a depositar y lo enviamos al metodo de vect
                        JOptionPane.showMessageDialog(null, "Deposito con Exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Saldo Disponible $"+vector.consultarSaldo(indiceNCuentas) , "Alerta", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;

                case 2:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la cuenta"));
                    indiceNCuentas = buscarNCuentas(vect, numeroCuenta);
                    //Lo mismo de el caso 1, le pedimos el numero de la cuenta y lo buscamos en el vector

                    if(indiceNCuentas == -1){//NO SE ENCONTRO CUENTA
                        JOptionPane.showMessageDialog(null, "La cuenta no se ha encontrado", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        cantidadDinero = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de dinero a retirar"));

                        if(vector.consultarSaldo(indiceNCuentas)<cantidadCuentas){//El dinero que pide es mayor al que ya esta almacenado
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            vector.retirarDinero(indiceNCuentas, numeroCuenta);
                            JOptionPane.showMessageDialog(null, "Retiro con Exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Saldo Disponible $"+vector.consultarSaldo(indiceNCuentas) , "Alerta", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;

                case 3:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la cuenta"));
                    indiceNCuentas = buscarNCuentas(vect, numeroCuenta);

                    if(indiceNCuentas == -1){//NO SE ENCONTRO CUENTA
                        JOptionPane.showMessageDialog(null, "La cuenta no se ha encontrado", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Saldo Disponible $"+vector.consultarSaldo(indiceNCuentas) , "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestros Servicios", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible, digite nuevamente", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }while(opcion !=4);

    }

    public static int buscarNCuentas(Cuenta vector[], int numeroCuentasB){//Este metodo es para buscar la cuenta dentro del vector
        int indice = 0;
        int iterador = 0;
        boolean numCuentasE = false; //Numero de Cuentas Encontradas

        while((iterador<vector.length) && (numCuentasE == false)){//Buscamos si la cuenta deseada existe
            if(vector[iterador].getNumeroCuenta() == numeroCuentasB){
                numCuentasE = true;
                indice = iterador;
            }
            iterador ++;
        }
        if(numCuentasE == false){
            indice = -1;
            //De lo contrario indicamos que no se econtro
        }
        return indice;
    }
}
