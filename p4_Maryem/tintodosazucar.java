import java.util.*;
public class tintodosazucar {
    public static void main(String[] args) {

        int nDepar = 5;
        int nMeses = 12;
        int[][] mventas = new int[nMeses][nDepar];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                mventas[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        int n;
        System.out.println("1. Ventas mensuales de toda la fabrica \n2. ventas anuales por departamento \n3. departamento con mayor venta en el mes de julio \n4. dado 	  el numero del departamento mostrar la mayor venta \n5. borrar departamento con menor venta del año\n0.Salir \n");
        Scanner opcion = new Scanner(System.in);

        System.out.println(".... MENU PRIMARIO ....");
        System.out.println("1. Ventas Mensuales de la fábrica");
        System.out.println("2. Ventas anuales por cada Departamento");
        System.out.println("3. Departamento que tuvo la mayor venta en el mes de julio. ");
        System.out.println("4. Mayores ventas por Departamento");
        System.out.println("5. Departamento con menores ventas (BORRAR)");
        System.out.println("6. exit");
        System.out.print("Ingrese opcion: ");

        n = opcion.nextInt();
        do {

        switch(n) {
            case 1:
                ventas_mensuales(mventas);
                break;
            case 2:
                ventas_anuales(mventas);
                break;
            case 3:
                deparConMyrVentadJulio(mventas);
                break;
            case 4:
                deparConMayorvent(mventas);
                break;
            case 5:
                borrarDeparConMenorVenta(mventas);
                break;
            }
            System.out.println();
            System.out.print("Ingrese opcion: ");
            n = opcion.nextInt();
        }while (n!=0);
    }


    public static void ventas_mensuales(int mventa[][]) {
        int total_vm = 0;
        for (int i = 0; i < 12; i++) {
            total_vm = 0;
            for (int j = 0; j < 5; j++) {
                total_vm = mventa[i][j] + total_vm;
                mventa[i][j] = (int) Math.round(Math.random() * 100);
            }
            System.out.println("En el mes " + (i + 1) + " el total de ventas de la fabrica fue de: " + total_vm);
        }

    }

    public static void ventas_anuales(int mventas[][]) {
        int total_va = 0;
        for (int j = 0; j < 5; j++) {
            total_va = 0;
            for (int i = 0; i < 12; i++) {
                total_va = mventas[i][j] + total_va;
            }
            System.out.println("El total de ventas en el departamento " + (j + 1) + " fue de: " + total_va);
        }
    }

    public static void deparConMyrVentadJulio(int mventa[][]) {
        int ventasJulio = 0;
        int my = 0;
        int depar = 0;
        for (int j = 0; j < 5; j++) {
            ventasJulio = 0;
            ventasJulio = mventa[7][j] + ventasJulio;
            if (my < ventasJulio) {
                my = ventasJulio;
                depar = depar + 1;
            }
            //System.out.println("Departamento "  + depar + " tuvo la mayor venta en el mes de julio: " + my);
        }
        System.out.println("Departamento " + depar + " tuvo la mayor venta en el mes de julio con un total de ventas de: " + my);
    }

    public static void deparConMayorvent(int mventa[][]) {
        Scanner depar = new Scanner(System.in);
        int d;
        int mes = 0;
        int mydepar = 0;
        int my = 0;
        System.out.print("Ingrese departamento: ");
        d = depar.nextInt();
        while (d > 5 || d < 0){
            System.out.print("Ingrese departamento valido: ");
            d = depar.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            mydepar = 0;
            mydepar = mventa[i][d-1] + mydepar;
            if (my < mydepar) {
                my = mydepar;
                mes +=1;
            }
        }
        System.out.println("Departamento " + (d) + " tuvo la mayor venta en el mes " + mes + " con venta de: " + my);
    }

    public static void borrarDeparConMenorVenta(int mventa[][]) {
        int minDeparVent = 999;
        int[][] matriznueva = new int[mventa.length][mventa[0].length - 1];
        int[] ventasDepa = new int[5];
        for (int j = 0; j < 5; j++) {
            minDeparVent = 0;
            for (int i = 0; i < 12; i++) {
                minDeparVent = mventa[i][j] + minDeparVent;
                ventasDepa[j] = minDeparVent;
            }
        }
        int posDep = 0;
        int venMenor = 999;
        for (int i = 0; i < ventasDepa.length; i++) {
            if (ventasDepa[i] < venMenor) {
                venMenor = ventasDepa[i];
                posDep = i;
            }
        }
        System.out.println("Departamento a eliminar " + (+posDep + 1) + " con menor venta de: " + venMenor);

        //procedimiento para eliminar la columna con menor venta
        for (int i = 0; i < mventa.length; i++) {
            int k = 0;
            for (int j = 0; j < mventa[0].length; j++) {
                if (j != posDep) {
                    matriznueva[i][k] = mventa[i][j];
                    k++;
                }
            }
        }
        System.out.println();
        System.out.println("Nueva matriz sin departamento con menor ventas ");
        for (int i = 0; i < matriznueva.length; i++) {
            System.out.println();
            System.out.print("[ ");
            for (int j = 0; j < matriznueva[0].length; j++) {
                System.out.print( matriznueva[i][j] + " ");
            }

            System.out.print("]");
        }

    }

}

