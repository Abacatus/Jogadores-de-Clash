package Jogadores_de_Clash.States;

import Jogadores_de_Clash.Jogador.José.Jogador;

public abstract class AbstractState implements State {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

    //1 = Dormindo, 2 = Jogando, 3 = Vadiando.
    public int ultimoEstado = 2;
    public int atualEstado = 0;

    private Jogador jogador;
    public AbstractState(Jogador jogador) {this.jogador = jogador;}

    public Jogador getJogador() {
        return jogador;
    }

    public void printStats(String state) {
        System.out.println(ANSI_VERDE + state + ANSI_RESET);
        System.out.println(ANSI_VERDE + "Felicidade: " + jogador.getFelicidade() + ANSI_RESET);
        System.out.println(ANSI_VERDE + "Energia: " + jogador.getEnergia() + ANSI_RESET);
    }

    public void enter() {
    }

    public void leave() {
    }

    public void transicao() {
    }
}
