package com.mybank;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta #" + numeroCuenta + ": " + saldo;
    }
}
