package com.mybank.ui;


import java.util.Scanner;

import com.mybank.businesslogic.Banco;

public class InterfazUsuario {
    private static Scanner scanner = new Scanner(System.in);
    private Banco banco;

    public InterfazUsuario(Banco banco) {
        this.banco = banco;
    }

    public void ejecutar() {
        int opcion = 0;
        do {
            System.out.println("Bienvenido al Banco XYZ");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Eliminar una cuenta");
            System.out.println("5. Listar todas las cuentas");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    retirar();
                    break;
                case 4:
                    eliminarCuenta();
                    break;
                case 5:
                    listarTodasLasCuentas();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el Banco XYZ");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 6);
    }

    private void crearCuenta() {
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        banco.crearCuenta(numeroCuenta, saldo);
        System.out.println("Cuenta creada exitosamente.");
    }

    private void depositar() {
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el monto a depositar: ");
        double monto = scanner.nextDouble();
        banco.depositar(numeroCuenta, monto);
        System.out.println("Depósito realizado exitosamente.");
    }

    private void retirar() {
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();
        banco.retirar(numeroCuenta, monto);
        System.out.println("Retiro realizado exitosamente.");
    }

    private void eliminarCuenta() {
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        banco.eliminarCuenta(numeroCuenta);
        System.out.println("Cuenta eliminada exitosamente.");
    }

    private void listarTodasLasCuentas() {
        System.out.println("Lista de todas las cuentas:");
        banco.listarTodasLasCuentas();
    }
}
