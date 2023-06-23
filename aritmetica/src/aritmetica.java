public class aritmetica {

    //Atributos de la clase
    int a;
    int b;
    //Constructor bacio de la clae
    aritmetica(){//El constructor tiene el mismo nombre de la clase
    }
    aritmetica( int arg1, int arg2){//creamos un constructor con parametros
         a = arg1;
         b = arg2;
    }
    //Este metodo suma todos los atributos
    int suamr(){
        return (a+b);
    }

    public int suma(int a, int b){//valores que va a recibir el metodo
        //esta de tipo int ya que va a regresar un tipo enteeor
        int resultado = a + b;
        return(resultado);//regresamos el valor y asi definimos el metodo

    }
}