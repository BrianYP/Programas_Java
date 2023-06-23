package paquete1;

public class clase2 {
    public static void main(String[] args) {
        clase1 ob = new clase1();
        ob.atributo1 = 15;
        /*Aca lo que estamos haciendo es crear un objeto de la clase1 en la que esta el atributo1
        * denominado como tipo string, al usarlo en la clase main desde el mismo paquete no hayinconvenientes
        * pero para darle acceso a otro paquete se requiere importarlo*/
    }
}
