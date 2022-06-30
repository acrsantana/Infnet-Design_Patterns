package br.com.infnet.patterns.builder;

import java.util.List;

public class VendedorBuilder implements FuncionarioBuilder{

    private long matricula;
    private String nome;
    private String sobrenome;
    private int idade;
    private Long quantidadeDeVendas;

    @Override public VendedorBuilder matricula(Long matricula) {
        this.matricula = matricula;
        return this;
    }

    @Override public VendedorBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override public VendedorBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    @Override public VendedorBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public VendedorBuilder quantidadeDeVendas(long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(this);
    }

    @Override public long getMatricula() {
        return matricula;
    }

    @Override public String getNome() {
        return nome;
    }

    @Override public String getSobrenome() {
        return sobrenome;
    }

    @Override public int getIdade() {
        return idade;
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }
}
