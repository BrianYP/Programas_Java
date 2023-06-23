import java.util.*;

public class MenuDesple {
    public Scanner entrada = new Scanner(System.in);
    Metodos a = new Metodos();
    Metodos b = new Metodos();
    Metodos c = new Metodos();
    public void menuDesplegable(){
        int opcion;

        do{
            contenido();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    numPolinomio();
                    break;
                case 2:
                    sumA();
                    break;
                case 3:
                    elimin();
                    break;
                case 4:
                    mostr();
                    break;
                case 5:
                    System.out.println("Gracias por usar Polinomio Mogotes :)");
                    break;
                default:
                    System.out.println("La opción no esta contemplada");
                    break;
            }
        }while(opcion!=5);
        entrada.close();
    }

    public void contenido(){
        System.out.print("\n----BIENVENIDO POLINOMIO MOGOTES----\n"+
                "1.Insertar polinomios\n"+
                "2.Sumar polinomios\n"+
                "3.Eliminar polinomio\n"+
                "4.Mostrar Polinomios\n"+
                "5.Salir\n"+
                "Ingrese una opción: ");
    }

    public void numPolinomio(){
        int insert,insert1,expoA,expoB;
        float coefA, coefB;
        System.out.print("Cantidad de polinomios A a ingresar: ");
        insert = entrada.nextInt();
        System.out.print("Cantidad de polinomios B a ingresar: ");
        insert1 = entrada.nextInt();

        for(int i=0; i<insert;i++){
            System.out.print((i+1)+" Ingresa el Coeficiente del polinomio A: ");
            coefA = entrada.nextFloat();
            System.out.print((i+1)+" Ingrese el Exponente del polinomio A: ");
            expoA = entrada.nextInt();
            a.insertarTermino(coefA, expoA);
            System.out.println();
        }
        for(int i=0; i<insert1;i++){
            System.out.print((i+1)+" Ingresa el Coeficiente del polinomio B: ");
            coefB = entrada.nextFloat();
            System.out.print((i+1)+" Ingrese el Exponente del polinomio B: ");
            expoB = entrada.nextInt();
            b.insertarTermino(coefB, expoB);
            System.out.println();
        }
    }

    public void mostr(){
        System.out.println("======> Polinomio A <======");
        a.mostrarPolinomio();
        System.out.println();
        System.out.println("======> Polinomio B <======");
        b.mostrarPolinomio();
        System.out.println();
        System.out.println("======> Polinomio C <======");
        c.mostrarPolinomio();
        System.out.println();
    }

    public void sumA(){
        c = a.sumar(b);
        System.out.println();
    }
    public void elimin(){
        Metodos m = new Metodos();
        System.out.print("Ingrese el exponente a eliminar: ");
        int expoAE = entrada.nextInt();
        m.eliminarTermino(expoAE);

    }
}
