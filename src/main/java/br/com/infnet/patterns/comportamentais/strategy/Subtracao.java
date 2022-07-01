package br.com.infnet.patterns.comportamentais.strategy;

public class Subtracao implements Operacao {
    public float calcula(float a, float b) {
        return a - b;
    }
}
