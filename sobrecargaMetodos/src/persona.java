public class persona {//Objeto persona
    String nombre;
    String dni;
    int edad;

    //Cuando hay mas de un constrictor a esto se le conoce como sobrecarga de constructor
    //--------------------------------------------------------------------------------------
    //METODO CONSTRUCTOR
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public persona(String dni) {//Constructor del dni de la persona
        this.dni = dni;
    }
    //--------------------------------------------------------------------------------------

    //Tambien podemos tener sobrecarga de metodos
    //--------------------------------------------------------------------------------------
    public void correr(){
        System.out.println("Hola, soy "+nombre+" tengo "+edad+" Y estoy corriendo una maraton");
    }

    //Creamos otro metodo con el mismo nombre, pero lo que lo diferencia es que este tiene parametros
    public void correr(int km){
        System.out.println("Estoy corriendo "+km+" Kilometros");
    }
    //--------------------------------------------------------------------------------------
}
