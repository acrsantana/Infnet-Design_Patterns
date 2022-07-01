package br.com.infnet.patterns.comportamentais.strategy;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Soma());

        System.out.println(calculadora.calcula(10, 2));

        calculadora.setOperacao(new Subtracao());
        System.out.println(calculadora.calcula(10, 2));

        calculadora.setOperacao(new Multiplicacao());
        System.out.println(calculadora.calcula(10, 2));

        calculadora.setOperacao(new Divisao());
        System.out.println(calculadora.calcula(10, 2));

    }
}
