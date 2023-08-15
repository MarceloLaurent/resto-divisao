package view;

import controller.CalculaRestoController;

public class Main {
    public static void main(String[] args) {

        CalculaRestoController cr = new CalculaRestoController();

        int resultado = cr.calculaResto(53, 3);

        System.out.println(resultado);
    }
}