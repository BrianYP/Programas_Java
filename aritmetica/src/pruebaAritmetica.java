public class pruebaAritmetica {
    public static void main(String[] args) {
        //Creamos un objeto de la clase aritmetica
        aritmetica ob1 = new aritmetica();//se llama al constructor de la calse
        ob1.a = 5;
        ob1.b = 3;
        int resultado = ob1.suamr();
        System.out.println("El resultado es = "+resultado);

        //Creamos un segundo objeto de tipo aritmetica
        aritmetica ob2 = new aritmetica(2, 4);
        System.out.println("El resultado del objeto 2 es = "+ob2.suamr());

    }
}
