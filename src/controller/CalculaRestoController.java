//Exercicio2
package controller;

public class CalculaRestoController {

    public CalculaRestoController() {
        super();
    }

    public int calculaResto(int dividendo, int divisor){
        if(dividendo < divisor){
            return dividendo;
        } else {
            return calculaResto(dividendo - divisor, divisor);
        }
    }
}
