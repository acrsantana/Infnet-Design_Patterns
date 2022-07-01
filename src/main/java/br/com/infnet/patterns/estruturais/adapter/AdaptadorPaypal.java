package br.com.infnet.patterns.estruturais.adapter;

public class AdaptadorPaypal implements Target{

    ComandosPaypal pagamento;

    public AdaptadorPaypal(ComandosPaypal paypal) {
        this.pagamento = paypal;
    }

    @Override public void efetuarPagamento() {
        pagamento.paypalSendMoney();
    }
}
