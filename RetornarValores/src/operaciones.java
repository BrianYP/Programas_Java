public class operaciones {
    //METODOS DE LA CLASE OPERACIONES

    public int sumar(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    public int restar(int n1, int n2){
        int resta = n1-n2;
        return resta;
    }
    public int multiplicacion(int n1, int n2){
        int multipli = n1*n2;
        return multipli;
    }
    public int division(int n1, int n2){
        int divi = n1/n2;
        return divi;
    }
    public void mostrarDatos(int suma, int resta, int multiplo, int divi){
        /*Le ponemos parametros devido a que las variables de cada metodo son locales*/
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplo);
        System.out.println("El resultado de la división es: "+divi);
    }
}
