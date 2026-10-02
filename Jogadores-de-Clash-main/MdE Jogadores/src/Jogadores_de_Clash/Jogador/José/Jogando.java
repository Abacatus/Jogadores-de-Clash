package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;


public class Jogando extends AbstractState {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

    public Jogando(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX: Partiu um Clash!" + ANSI_RESET);
    }

    public void execute(){
        getJogador().addFelicidade(-2);
        getJogador().addEnergia(-5);
        System.out.println(ANSI_VERDE + "--------------------------------" + ANSI_RESET);
        printStats(ANSI_VERDE + "XxJoséKillerxX esta jogando..." + ANSI_RESET);

        if (getJogador().getEnergia() < 10){
            getJogador().mudarEstado(new Dormindo(getJogador()));
        } else if (getJogador().getFelicidade() < 10) {
            getJogador().mudarEstado(new Dormindo(getJogador()));
        }
    }

    public void leave() {
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX: Cansei de jogar..." + ANSI_RESET);
    }
}
