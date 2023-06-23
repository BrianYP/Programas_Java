//importaciones
import java.io.*;
import java.util.*;

public class importarArchivos{
    public static void main(String[] args) {
    
        try{

            //Creamos un objeto archivo para utilzarlo (txt)
            File archivo = new File("matrizNumeros.txt");

            //Entrada Scaner para leer el archivo txt
            Scanner entrada = new Scanner(archivo);

            //Creamos una matriz para alacenar los datos del archivo txt
            int [][] matriz = new int[4][4];

            //Recorremos el archivo
            int fila = 0;

            while(entrada.hasNextLine()){//usamos el metodo de scanner para comprobar si hay mas lineas de texto
                String lineas = entrada.nextLine();
                String[] numeros = lineas.split(" ");
                //usamos split para dividir cada linea ingresada en un vector de manera individual

                for (int i=0;i<numeros.length;i++){
                    matriz[fila][i] = Integer.parseInt(numeros[i]);
                }

                fila++;
            }

            //Cerramos el obtejo scanner que lo que
            entrada.close();

            //Mostramos la mtraiz en consola
            for(int i=0;i<matriz.length;i++){
                for(int j=0; j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+" - ");
                }
                System.out.println();
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}