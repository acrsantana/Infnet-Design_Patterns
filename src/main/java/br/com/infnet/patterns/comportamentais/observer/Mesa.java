package br.com.infnet.patterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mesa {
    private List<Jogador> jogadores = new ArrayList<>();
    private Set<EscutaMesa> assinantes = new HashSet<>();

    public void adicionaJogador(Jogador jogador){
        jogadores.add(jogador);
        notificaAssinantes();
    }

    public void assinaEscutaMesa(EscutaMesa assinante){
        assinantes.add(assinante);
    }

    public void cancelaEscutaMesa(EscutaMesa assinante) {
        assinantes.remove(assinante);
    }

    public void notificaAssinantes(){
        assinantes.forEach(assinante -> assinante.notifica(jogadores));
    }
}
