package br.com.infnet.patterns.criacionais.builder;

public class EngenheiroBuilder implements FuncionarioBuilder{
    private long matricula;
    private String nome;
    private String sobrenome;
    private int idade;
    private String numeroConselho;
    private int notaMestrado = 0;
    private int notaDoutorado = 0;
    private boolean fluenteEmIngles = false;

    public EngenheiroBuilder matricula(Long matricula){
        this.matricula = matricula;
        return this;
    }

    public EngenheiroBuilder nome(String nome){
        this.nome = nome;
        return this;
    }

    public EngenheiroBuilder sobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        return this;
    }

    public EngenheiroBuilder idade(int idade){
        this.idade = idade;
        return this;
    }

    public EngenheiroBuilder numeroConselho(String numeroConselho){
        this.numeroConselho = numeroConselho;
        return this;
    }

    public EngenheiroBuilder notaMestrado(int notaMestrado){
        this.notaMestrado = notaMestrado;
        return this;
    }

    public  EngenheiroBuilder notaDoutorado(int notaDoutorado){
        this.notaDoutorado = notaDoutorado;
        return this;
    }

    public EngenheiroBuilder possuiInglesFluente(boolean fluenteEmIngles){
        this.fluenteEmIngles = fluenteEmIngles;
        return this;
    }

    public Engenheiro build(){
        return new Engenheiro(this);
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumeroConselho() {
        return numeroConselho;
    }

    public int getNotaMestrado() {
        return notaMestrado;
    }

    public int getNotaDoutorado() {
        return notaDoutorado;
    }

    public boolean getFluenteEmIngles() {
        return fluenteEmIngles;
    }
}
