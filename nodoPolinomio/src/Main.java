public class Main {
    public static void main(String[] args) {
        PolinomioF3  a = new PolinomioF3();
        PolinomioF3  b = new PolinomioF3();
        PolinomioF3  c = new PolinomioF3();
        a.insertarTermino(6, 4);
        a.insertarTermino(6, 4);
        a.insertarTermino(6, 6);
        a.insertarTermino(4, 2);
        a.insertarTermino(1, 3);
        a.insertarTermino(8, 8);
        b.insertarTermino(3, 1);
        b.insertarTermino(5, 2);
        b.insertarTermino(2, 8);
        System.out.println("====== Polinomio A ============ \n \n ");
        a.mostrarPolinomio();
        System.out.println("====== Polinomio B ============ \n \n ");
        b.mostrarPolinomio();
        c = a.sumar(b);
        System.out.println("====== Polinomio C ============ \n \n ");
        c.mostrarPolinomio();
    }
}