package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;

public class Dormindo extends AbstractState {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";


    public Dormindo(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println(ANSI_VERDE + "I================================I"+ ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX: Melhor eu descansar..." + ANSI_RESET);
    }

    public void execute(){
        getJogador().addFelicidade(1);
        getJogador().addEnergia(15);
        System.out.println(ANSI_VERDE + "--------------------------------" + ANSI_RESET);
        printStats(ANSI_VERDE + "XxJoséKillerxX: Zzzzzzzz..." + ANSI_RESET);

        if (getJogador().getEnergia() >= 100){
            if (getJogador().getFelicidade() >= 70){
                getJogador().mudarEstado(new Jogando(getJogador()));
            } else {
                getJogador().mudarEstado(new Vadiando(getJogador()));
            }
        }
    }

    public void leave() {
        System.out.println(ANSI_VERDE + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_VERDE + "XxJoséKillerxX:Ja dormi o suficiente!" + ANSI_RESET);
    }

}
