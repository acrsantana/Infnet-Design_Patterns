package br.com.infnet.patterns.criacionais.builder;

public interface FuncionarioBuilder {

    long matricula = 0;
    String nome = "";
    String sobrenome = "";
    int idade = 0;

    public FuncionarioBuilder matricula(Long matricula);
    public FuncionarioBuilder nome(String nome);
    public FuncionarioBuilder sobrenome(String sobrenome);
    public FuncionarioBuilder idade(int idade);

    public long getMatricula();
    public String getNome();
    public String getSobrenome();
    public int getIdade();
}
