public class persona {//Este es un onjeto de persona
    //ATRIBUTOS
    String nombre;
    int edad;

    public persona(String _nombre, int _edad){//este es el constructor para nuestro objeto
        nombre = _nombre;
        edad = _edad;
        //De esta manera le indicamos a nuestras variables publiscas, y esto sirve para inciar
    }
    public void  mostrarDatos(){
        System.out.println("Hola, como estas "+nombre+" ?");
        System.out.println("Tu edad es "+edad);
    }
    //De esta manera mostramos los atributos de la clase persona
}
