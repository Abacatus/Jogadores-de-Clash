package Jogadores_de_Clash.Jogador;

import Jogadores_de_Clash.States.AbstractState;

public class Vadiando extends AbstractState {

    public Vadiando(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println("I================================I");
        System.out.println("Que preguiça...");
    }

    public void execute() {
        getJogador().addFelicidade(5);
        System.out.println("--------------------------------");
        printStats("Fazendo nada.....");

        if (getJogador().getFelicidade() >= 60) {
            getJogador().mudarEstado(new Jogando(getJogador()));
        }
    }
}
