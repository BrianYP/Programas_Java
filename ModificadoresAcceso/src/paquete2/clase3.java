package paquete2;
import paquete1.clase1;//Imporrtamos el paquete donde esta la clase a la que queremos acceder
public class clase3 {
    public static void main(String[] args) {
        clase1 ob1 = new clase1();
        ob1.atributo1 = 16;
    }
}
