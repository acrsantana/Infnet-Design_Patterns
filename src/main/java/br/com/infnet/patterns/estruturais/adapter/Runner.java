package br.com.infnet.patterns.estruturais.adapter;

public class Runner {
    public static void main(String[] args) {
        Target comandos = new AdaptadorPagseguro(new ComandosPagseguro());

        comandos.efetuarPagamento();

        comandos = new AdaptadorPaypal(new ComandosPaypal());

        comandos.efetuarPagamento();
    }

}
