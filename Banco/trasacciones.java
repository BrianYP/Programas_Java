import java.util.*;
public class trasacciones {
    //Metodo para buscar el numero de cuenta
    public static int buscarNCuentas(Cuenta cuentas[], int numeroCuentaB){
        int indice = 0;
        int iterador =0;
        boolean numeroCuentaEncontrado = false;

        while((iterador < cuentas.length) && (numeroCuentaEncontrado == false)){
            if(cuentas[iterador].getN_Cuenta() == numeroCuentaB){
                numeroCuentaEncontrado = true;
                indice = iterador;
                //Buscamos la cuenta dentro del arreglo
            }
            iterador ++;
        }
        if(numeroCuentaEncontrado == false){
            indice = -1;
            /*En cado de que no encontremos la cuenta y el boolean siga siendo falso
            * Entones retornamos (-1) para indicar que no hemos podido
            * encontrar la cuenta dentro del arreglo*/
        }
        return indice;
        //Retornamos el valor del indice
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido, dni;
        Cuenta cuentas[];//Arreglo de cuentas, por si el cleinte toene muchas cuentas
        Cliente cliente;
        int numeroCuenta, cantidadCuentas, opcion, indiceNCuenta;
        double saldo, cantidadDinero;

        //Pedimos los datos del cliente
        System.out.print("Digite el nombre del cliente: ");
        nombre = teclado.next();

        System.out.print("Digite el apellido: ");;
        apellido = teclado.next();

        System.out.print("Digite el DNI: ");
        dni = teclado.next();

        System.out.print("Digite la cantidad de cuentas que tiene: ");
        cantidadCuentas = teclado.nextInt();

        System.out.println();

        cuentas = new Cuenta[cantidadCuentas];//Asignando la cantidad de cuentas

        //Rellenamos las cuentas
        for(int i=0; i<cuentas.length; i++){
            System.out.println("\nDigite la Cuenta ["+(i+1)+"]");

            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = teclado.nextInt();

            System.out.print("Digite el saldo de la cuenta: ");
            saldo = teclado.nextInt();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
            /*En la cuenta en la que este [i], se le asignaran los valores
            * de numero de cuentas, y el saldo que se requieren en los metodos de la clase
            * Cliente*/
        }
        cliente = new Cliente(nombre, apellido, dni, cuentas);//Le pasamos los parametros

        do {
            System.out.println("\n---Menu---");
            System.out.println("1.Ingresar saldo a la cuenta");
            System.out.println("2.Retirar saldo de la cuenta");
            System.out.println("3.Consultar saldo de la cuenta");
            System.out.println("4.Salir");
            System.out.print("Digite una opción: ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNCuenta = buscarNCuentas(cuentas, numeroCuenta);
                    //implementamos el metodo para buscar la cuenta en base al numero de cuenta

                    if(indiceNCuenta == -1){//En caso de no encontrar la cuenta
                        System.out.print("\nLa cuenta no ha sido encontrada, verifique su numero de Cuenta");
                        System.out.println();
                    }
                    else{
                        System.out.print("Digite la cantidad de dinero a Depositar: ");
                        cantidadDinero = teclado.nextDouble();
                        cliente.ingreDinero(indiceNCuenta, cantidadDinero);//Se ingresa la cantidad de dinero
                        System.out.println("\nDeposito con exito");
                        System.out.print("Saldo disponible $"+cliente.consulSaldo(indiceNCuenta));
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("\nDigite el numero de Cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNCuenta = buscarNCuentas(cuentas, numeroCuenta);

                    if(indiceNCuenta == -1){
                        System.out.println("\nNo existe una cuenta con ese numero");
                        System.out.println();
                    }
                    else{
                        System.out.print("\nDigite la cantidad de dinero a retirar: ");
                        cantidadDinero = teclado.nextDouble();

                        if(cliente.consulSaldo(indiceNCuenta)<cantidadDinero){
                            //Si la cantidad que se desea retirar es mayor a la que se tiene en la cuenta, aviso
                            System.out.println("\nSaldo insuficiente");
                        }
                        else{
                            cliente.retirarDinero(indiceNCuenta, numeroCuenta);
                            System.out.println();
                            System.out.println("Retiro con exito");
                            System.out.println("Saldo disponible de la cuenta: $"+cliente.consulSaldo(indiceNCuenta));
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = teclado.nextInt();
                    indiceNCuenta = buscarNCuentas(cuentas, numeroCuenta);

                    if(indiceNCuenta == -1){//Nuevamente buscamos si la cuenta existe
                        System.out.println("\nNo existe una cuenta con ese numero");
                        System.out.println();
                    }
                    else{
                        System.out.println("Saldo disponible: $"+cliente.consulSaldo(indiceNCuenta));
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("\nOpcion no disponible, digite nuevamente");
                    break;
            }

        }while(opcion !=4);//Diferente de cuatro debido a las opciones que otorgamos

    }
}
