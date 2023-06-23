public class Cuenta {
    private boolean estado;
    private int numeroCuenta;
    private double saldo;

    //CONSTRUCTORES
    public Cuenta(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta(boolean estado) {
        this.estado = estado;
    }

    //USO DE SETTERS AND GETTERS
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //---------------------------------------------METODOS
    public void depositarDinero(double cantidad){
        saldo = (double) saldo + cantidad;
    }
    public void retirarDinero(double cantidad){
        saldo = (double) saldo - cantidad;
    }

}
