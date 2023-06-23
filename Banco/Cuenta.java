public class Cuenta {
    private  int n_Cuenta;
    private double saldo;

    public Cuenta(int n_Cuenta, double saldo) {
        this.n_Cuenta = n_Cuenta;
        this.saldo = saldo;
    }

    public int getN_Cuenta() {
        return n_Cuenta;
    }

    public void setN_Cuenta(int n_Cuenta) {
        this.n_Cuenta = n_Cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //------------------------------------------------------Metodos
    public void depositarDinero(double cantidad){
        saldo += cantidad;//Sumamos el dinero ingresado
    }
    public void retirarDinero(double cantidad){
        saldo -= cantidad;//Este es para retirar
    }
}
