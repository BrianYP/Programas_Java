public class licuadora {
    public static void main(String[] args) {
        estado licua1 = new estado();
        motor motor1 = new motor("Constante", 12);
        motor1.encendido();
        licua1.licuar();
        licua1.apagar();
        motor1.apagado();
        motor1.mostrar();

    }
}