public class personaUso {
    public static void main(String[] args) {
        //accediendo y creando una variable para usar un objeto
        persona p1 = new persona();

        //le damos un valor a cada uno de los objetos
        p1.nombre = "Manolo";
        p1.apellidoPaterno = "El negrito";
        p1.apellidoMaterno = "El chichi";

        //Llamamos a los objetos y a los objetos
        p1.desplegarNombre();
    }
}