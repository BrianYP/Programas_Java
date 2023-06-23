package com.mybank;

import com.mybank.businesslogic.Banco;
import com.mybank.presentation.Menu;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Menu menu = new Menu(banco);
        menu.mostrarMenu();
        //Es aqui donde se ejecuta todo el codigo
    }
}
