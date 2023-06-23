public class estudiante extends persona{//Heredamos de la clase persona
    private int codigoEstudiante;
    private float notaEstudiante;

    //Constructor heredado
    public estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaEstudiante){
        super(nombre, apellido, edad);//Indicamos que estos ya estan inicializados
        this.codigoEstudiante = codigoEstudiante;
        this.notaEstudiante = notaEstudiante;
    }

    public void mostrarDatos(){
        System.out.println("EL nombre es: "+getNombre()+
                "\nEl apellido es: "+getApellido()+
                "\nLa edad es: "+getEdad()+
                "\nCodigo de estudiate: "+codigoEstudiante+
                "\nNota de estudiante: "+notaEstudiante);
    }
}
