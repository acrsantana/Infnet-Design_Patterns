package br.com.infnet.patterns.builder;

abstract class Funcionario {
    protected Long matricula;
    protected String nome;
    protected String sobrenome;
    protected int idade;

    public Funcionario() {
        totalDeFuncionarios++;
    }

    public Funcionario(FuncionarioBuilder funcionarioBuilder) {
        this.matricula = funcionarioBuilder.getMatricula();
        this.nome = funcionarioBuilder.getNome();
        this.sobrenome = funcionarioBuilder.getSobrenome();
        this.idade = funcionarioBuilder.getIdade();
        totalDeFuncionarios++;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome='" +
            nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", idade=" +
            idade + '}';
    }

    public static int totalDeFuncionarios = 0;
}
