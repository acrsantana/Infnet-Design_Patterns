package br.com.infnet.patterns.criacionais.builder;

import java.util.Date;

public class Engenheiro extends Funcionario {
    private String numeroConselho;
    private Integer notaMestrado = 0;
    private Integer notaDoutorado = 0;
    private boolean fluenteEmIngles = false;
    private final int IDADE_LIMITE = 50;
    private final int NOTA_APROVACAO_MESTRADO = 7;
    private final int NOTA_APROVACAO_DOUTORADO = 5;
    public Engenheiro(EngenheiroBuilder engenheiroBuilder) {
        super(engenheiroBuilder);
        this.numeroConselho = engenheiroBuilder.getNumeroConselho();
        this.notaMestrado = engenheiroBuilder.getNotaMestrado();
        this.notaDoutorado = engenheiroBuilder.getNotaDoutorado();
        this.fluenteEmIngles = engenheiroBuilder.getFluenteEmIngles();
    }
    public boolean eMenorDe50Anos(){
        return getIdade() < IDADE_LIMITE;
    }

    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

    public boolean eHabilitadoParaTrabalharFora() {
        return eMenorDe50Anos() && eFluenteEmIngles() && (aprovadoMestrado() || aprovadoDoutorado());
    }

    private boolean aprovadoDoutorado() {
        return this.notaDoutorado > NOTA_APROVACAO_DOUTORADO;
    }

    private boolean aprovadoMestrado() {
        return this.notaMestrado > NOTA_APROVACAO_MESTRADO;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public void setNotaMestrado(Integer notaMestrado) {
        this.notaMestrado = notaMestrado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public void setNotaDoutorado(Integer notaDoutorado) {
        this.notaDoutorado = notaDoutorado;
    }

    public boolean eFluenteEmIngles() {
        return fluenteEmIngles;
    }

    public void setFluenteEmIngles(boolean fluenteEmIngles) {
        this.fluenteEmIngles = fluenteEmIngles;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    @Override public String toString() {
        return "Engenheiro{" + "numeroConselho='" + numeroConselho + '\'' + ", notaMestrado=" +
            notaMestrado + ", notaDoutorado=" + notaDoutorado + ", fluenteEmIngles=" +
            fluenteEmIngles + '}' + super.toString();
    }
}
