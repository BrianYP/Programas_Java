package com.mybank.businesslogic;


import com.mybank.Cuenta;
import com.mybank.presentation.Menu;
import com.mybank.ui.InterfazUsuario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void crearCuenta(int numeroCuenta, double saldoInicial) {
        Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial);
        cuentas.add(cuenta);
    }

    public void depositar(int numeroCuenta, double monto) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.depositar(monto);
        } else {
            System.out.println("La cuenta no existe.");
        }
    }

    public void retirar(int numeroCuenta, double monto) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.retirar(monto);
        } else {
            System.out.println("La cuenta no existe.");
        }
    }

    public void eliminarCuenta(int numeroCuenta) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuentas.remove(cuenta);
        } else {
            System.out.println("La cuenta no existe.");
        }
    }

    public void listarTodasLasCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

    private Cuenta buscarCuenta(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}
