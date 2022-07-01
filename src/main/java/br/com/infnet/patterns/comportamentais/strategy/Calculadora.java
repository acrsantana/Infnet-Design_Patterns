package br.com.infnet.patterns.comportamentais.strategy;

public class Calculadora {

    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public float calcula(float a, float b) {
        return operacao.calcula(a, b);
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }
}
