package br.com.infnet.patterns.estruturais.adapter;

public class AdaptadorPagseguro implements Target{

    ComandosPagseguro comandos;

    public AdaptadorPagseguro(ComandosPagseguro pagseguro) {
        this.comandos = pagseguro;
    }

    @Override public void efetuarPagamento() {
        comandos.pagseguroCharges();
    }
}
