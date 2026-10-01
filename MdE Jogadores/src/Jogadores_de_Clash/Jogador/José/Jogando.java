package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;


public class Jogando extends AbstractState {

    public Jogando(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println("I================================I");
        System.out.println("XxJoséKillerxX: Partiu um Clash!");
    }

    public void execute(){
        getJogador().addFelicidade(-2);
        getJogador().addEnergia(-5);
        System.out.println("--------------------------------");
        printStats("XxJoséKillerxX esta jogando...");

        if (getJogador().getEnergia() < 10){
            getJogador().mudarEstado(new Dormindo(getJogador()));
        } else if (getJogador().getFelicidade() < 10) {
            getJogador().mudarEstado(new Dormindo(getJogador()));
        }
    }
}
