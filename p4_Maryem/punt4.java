//importaciones
import java.util.*;

public class punt4{
    public static void main(String[] args) {
        System.out.println("--------------Matriz de los buses--------------");
        System.out.println("1.Matriz de datos de los buses\n2.2.Viajes mayor y menor\n3.Total de vieajes por bus");
        System.out.println("4.Promedio de cada bus\n5.Salir");
        System.out.println("Selecione una opcion");

        int [][] tablaBus ={
            {1,2,3,4,5,6,7,8,9,10},
            {2,4,8,12,2,5,5,8,12,15},
            {4,15,8,9,10,4,67,3,7,20},
            {6,4,7,9,0,2,5,7,2,4},
            {9,6,9,4,8,18,24,12,8,15},
            {10,24,6,9,33,24,4,9,7,23}
        }; //Creamos la matriz con los datos de la empresa de buses

        
        int max = tablaBus[0][0];
        int maxFila = 0;
        int maxColumn = 0;
        int min = tablaBus[0][0];
        int minFila = 0;
        int minColumn = 0;
    
        for (int i = 0; i < tablaBus.length; i++) {
            for (int j = 0; j < tablaBus[i].length; j++) {
                if (tablaBus[i][j] > max) {
                    max = tablaBus[i][j];
                    maxFila = i;
                    maxColumn = j;
                }
                if (tablaBus[i][j] < min) {
                    min = tablaBus[i][j];
                    minFila = i;
                    minColumn = j;
                }
            }
        }
    
        System.out.println("El numero de viajes mayor fue " + max);
        System.out.println("Se encuentra en la fila " + maxFila + " y la columna " + maxColumn);
        System.out.println("El numero de viajes menor fue " + min);
        System.out.println("Se encuentra en la fila " + minFila + " y la columna " + minColumn);

        //CREAMOS UNA ENTRADA CON SCANNER
        Scanner entrada = new Scanner(System.in);
        boolean validar = false;

        while(!validar){//VALIDAMOS 
            int opcion = entrada.nextInt();

            if(opcion<1 || opcion>5){
                System.out.println("Seleccione una opcion que este contemplada");
            }
            else if(opcion>0 && opcion<6){
                validar = true;
            }

            if(validar == true){
                switch(opcion){
                    case 1:
                        matrizBus();
                        break;
                    case 2:
                        mayorMenorS(null);
                        break;
                    case 3:
                        totalBuses();
                        break;
                    case 4:
                        promedio();
                        break;
                    case 5:
                        System.out.println("El sistema se cierra");
                        break;
                        
                }
            }
        }
        entrada.close();

    }

    public static void matrizBus(){
        int [][] tablaBus ={
            {1,2,3,4,5,6,7,8,9,10},
            {2,4,8,12,2,5,5,8,12,15},
            {4,15,8,9,10,4,67,3,7,20},
            {6,4,7,9,0,2,5,7,2,4},
            {9,6,9,4,8,18,24,12,8,15},
            {10,24,6,9,33,24,4,9,7,23}
        }; //Creamos la matriz con los datos de la empresa de buses

        for(int i=0; i<6;i++){
            System.out.println();
            for(int j=0; j<10;j++){
                System.out.print(tablaBus[i][j]+"\t");//Mostramos la matriz
            }
        }
    }

    public static void mayorMenorS(int tablaBus[][]) {

    
        int max = tablaBus[0][0];
        int maxFila = 0;
        int maxColumn = 0;
        int min = tablaBus[0][0];
        int minFila = 0;
        int minColumn = 0;
    
        for (int i = 0; i < tablaBus.length; i++) {
            for (int j = 0; j < tablaBus[i].length; j++) {
                if (tablaBus[i][j] > max) {
                    max = tablaBus[i][j];
                    maxFila = i;
                    maxColumn = j;
                }
                if (tablaBus[i][j] < min) {
                    min = tablaBus[i][j];
                    minFila = i;
                    minColumn = j;
                }
            }
        }
    
        System.out.println("El numero de viajes mayor fue " + max);
        System.out.println("Se encuentra en la fila " + maxFila + " y la columna " + maxColumn);
        System.out.println("El numero de viajes menor fue " + min);
        System.out.println("Se encuentra en la fila " + minFila + " y la columna " + minColumn);
    }
    

    public static void totalBuses(){

        String [] estaciones = {"Pereira", "Barranquilla", "Cucuta", "Cartagena", "Santa Marta"};
        int [] totales ={149, 147, 113, 73, 46};

        for(int i=0;i<5;i++){
            System.out.println(estaciones[i]+" "+totales[i]+"\t");
            
        }
    }

    public static void promedio(){
        System.out.println("El promedio de cada bus es");

        int bus_01 = 2+4+6+9+10;
        int bus_02 = 4+15+4+6+24;
        int bus_03 = 8+8+7+9+6;
        int bus_04 = 12+9+9+4+9;
        int bus_05 = 2+10+0+8+33;
        int bus_06 = 5+4+2+18+24;
        int bus_07 = 5+67+5+24+4;
        int bus_08 = 8+3+7+12+9;
        int bus_09 = 12+7+2+8+7;
        int bus_10 = 15+20+4+15+23;
    
        int promedio_01 = bus_01/5;
        int promedio_02 = bus_02/5;
        int promedio_03 = bus_03/5;
        int promedio_04 = bus_04/5;
        int promedio_05 = bus_05/5;
        int promedio_06 = bus_06/5;
        int promedio_07 = bus_07/5;
        int promedio_08 = bus_08/5;
        int promedio_09 = bus_09/5;
        int promedio_10 = bus_10/5;

        System.out.println("El promedio del bus 1 es "+promedio_01);
        System.out.println("El promedio del bus 1 es "+promedio_02);
        System.out.println("El promedio del bus 1 es "+promedio_03);
        System.out.println("El promedio del bus 1 es "+promedio_04);
        System.out.println("El promedio del bus 1 es "+promedio_05);
        System.out.println("El promedio del bus 1 es "+promedio_06);
        System.out.println("El promedio del bus 1 es "+promedio_07);
        System.out.println("El promedio del bus 1 es "+promedio_08);
        System.out.println("El promedio del bus 1 es "+promedio_09);
        System.out.println("El promedio del bus 1 es "+promedio_10);
    }
    
}