package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;

public class Vadiando extends AbstractState {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

    public Vadiando(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX: Que preguiça..." + ANSI_RESET);
    }

    public void execute() {
        getJogador().addFelicidade(5);
        System.out.println(ANSI_VERDE + "--------------------------------" + ANSI_RESET);
        printStats(ANSI_VERDE + "XxJoséKillerxX esta fazendo nada....." + ANSI_RESET);

        if (getJogador().getFelicidade() >= 60) {
            getJogador().mudarEstado(new Jogando(getJogador()));
        }
    }


    public void leave() {
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX: Que preguiça de fazer nada..." + ANSI_RESET);
    }
}
