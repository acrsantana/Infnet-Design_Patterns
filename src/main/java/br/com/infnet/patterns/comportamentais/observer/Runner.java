package br.com.infnet.patterns.comportamentais.observer;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Mesa mesa = new Mesa();
        Jogador jogador1 = new Jogador("João", "Scrum Master");
        mesa.assinaEscutaMesa(jogador1);
        Jogador jogador2 = new Jogador("José", "Developer");
        Jogador jogador3 = new Jogador("Maria", "Developer");
        mesa.assinaEscutaMesa(jogador3);
        Jogador jogador4 = new Jogador("Luna", "Developer");
        Jogador jogador5 = new Jogador("Amanda", "Product Owner");

        mesa.adicionaJogador(jogador1);
        Thread.sleep(1500);
        mesa.adicionaJogador(jogador2);
        Thread.sleep(1500);
        mesa.adicionaJogador(jogador3);
        Thread.sleep(1500);
        mesa.adicionaJogador(jogador4);
        Thread.sleep(1500);
        mesa.adicionaJogador(jogador5);
    }
}
