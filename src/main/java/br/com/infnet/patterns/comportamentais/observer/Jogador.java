package br.com.infnet.patterns.comportamentais.observer;

import java.util.List;

public class Jogador implements EscutaMesa{
    private String nome;
    private String papel;

    public Jogador(String nome, String papel) {
        this.nome = nome;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public String getPapel() {
        return papel;
    }

    @Override public void notifica(List<Jogador> jogadores) {
        System.out.println("=================");
        System.out.println("Assinante: " + this.nome);
        System.out.println("-----------------");
        System.out.println("Segue lista de jogadores atualizada: ");
        System.out.println(jogadores);
        System.out.println("=================");
        System.out.println();
    }

    @Override public String toString() {
        return "{\"nome\":\"" + nome + "\", \"papel\":\"" + papel + "\"}";
    }
}
