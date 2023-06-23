package com.mybank.presentation;

import java.util.Scanner;

import com.mybank.businesslogic.Banco;

public class Menu {
    private Banco banco;
    private Scanner scanner;

    public Menu(Banco banco) {
        this.banco = banco;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("===============");
            System.out.println("BANCO MOGOTES");
            System.out.println("===============");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Eliminar cuenta");
            System.out.println("5. Ver lista de cuentas");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número de la cuenta: ");
                int numeroCuenta = scanner.nextInt();
                System.out.print("Ingrese el saldo inicial: ");
                double saldoInicial = scanner.nextDouble();
                banco.crearCuenta(numeroCuenta, saldoInicial);
                System.out.println("Cuenta creada exitosamente.");
                break;
            case 2:
                System.out.print("Ingrese el número de la cuenta: ");
                numeroCuenta = scanner.nextInt();
                System.out.print("Ingrese el monto a depositar: ");
                double montoDeposito = scanner.nextDouble();
                banco.depositar(numeroCuenta, montoDeposito);
                break;
            case 3:
                System.out.print("Ingrese el número de la cuenta: ");
                numeroCuenta = scanner.nextInt();
                System.out.print("Ingrese el monto a retirar: ");
                double montoRetiro = scanner.nextDouble();
                banco.retirar(numeroCuenta, montoRetiro);
                break;
            case 4:
                System.out.print("Ingrese el número de la cuenta a eliminar: ");
                numeroCuenta = scanner.nextInt();
                banco.eliminarCuenta(numeroCuenta);
                System.out.println("Cuenta eliminada exitosamente.");
                break;
            case 5:
                System.out.println("Lista de cuentas:");
                banco.listarTodasLasCuentas();
                break;
            case 6:
                System.out.println("¡Gracias por utilizar nuestro servicio!");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
