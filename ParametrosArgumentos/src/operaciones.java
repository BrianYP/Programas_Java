public class operaciones {
    //VARIABLES PUBLICAS
    int suma,resta, multiplicacion,division;

    public void suma(int numero1, int numero2){//USO DE PARAMETROS
        suma = numero1+numero2;//numero1 y 2 son variables locales
    }
    public void resta(int numero1, int numero2){
        resta = numero1-numero2;
    }
    public void multiplicacion(int numero1, int numero2){
        multiplicacion = numero1-numero2;
    }
    public void division(int numero1, int numero2){
        division = numero1-numero2;
    }
    public void mostrarResultados(){
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
        System.out.println("El resultado de la división es "+division);
    }
}
