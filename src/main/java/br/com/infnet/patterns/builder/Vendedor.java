package br.com.infnet.patterns.builder;

import java.util.List;

public class Vendedor extends Funcionario{
    private Long quantidadeDeVendas;
    private final int META_DE_VENDAS = 35;

    public Vendedor() {}
    public Vendedor(VendedorBuilder vendedorBuilder) {
        super(vendedorBuilder);
        this.quantidadeDeVendas = vendedorBuilder.getQuantidadeDeVendas();
    }

    public boolean isPlatinum(){
        return isMetaBatida();
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    private boolean isMetaBatida() {
        return getQuantidadeDeVendas() > META_DE_VENDAS;
    }

    @Override public String toString() {
        return "Vendedor{" + "quantidadeDeVendas=" + getQuantidadeDeVendas() + super.toString();
    }
}
