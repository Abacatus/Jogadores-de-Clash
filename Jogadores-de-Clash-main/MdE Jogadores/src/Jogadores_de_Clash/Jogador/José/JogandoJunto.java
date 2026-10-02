package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;

public class JogandoJunto extends AbstractState {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

    public JogandoJunto(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "Bora uma duplinha?" + ANSI_RESET);
    }

    public void execute(){
        getJogador().addFelicidade(2);
        getJogador().addEnergia(-3);
        System.out.println(ANSI_VERDE + "--------------------------------" + ANSI_RESET);
        printStats(ANSI_VERDE + "Jogando em dupla..." + ANSI_RESET);

        if (getJogador().getEnergia() < 10){
            getJogador().mudarEstado(new Dormindo(getJogador()));
        } else if (getJogador().getFelicidade() < 10) {
            getJogador().mudarEstado(new Dormindo(getJogador()));
        }
    }

    public void leave(){
    }
}
