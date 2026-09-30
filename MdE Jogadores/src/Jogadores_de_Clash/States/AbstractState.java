package Jogadores_de_Clash.States;

import Jogadores_de_Clash.Jogador.Jogador;

public abstract class AbstractState implements State {
    private Jogador jogador;
    public AbstractState(Jogador jogador) {this.jogador = jogador;}

    public Jogador getJogador() {
        return jogador;
    }

    public void printStats(String state) {
        System.out.println(state);
        System.out.println("Felicidade: " + jogador.getFelicidade());
        System.out.println("Energia: " + jogador.getEnergia());
    }

    public void enter() {
    }

    public void leave() {
    }
}
