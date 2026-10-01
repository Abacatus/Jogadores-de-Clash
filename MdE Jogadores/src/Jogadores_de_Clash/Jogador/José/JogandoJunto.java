package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.AbstractState;

public class JogandoJunto extends AbstractState {

    public JogandoJunto(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println("I================================I");
        System.out.println("Bora uma duplinha?");
    }

    public void execute(){
        getJogador().addFelicidade(2);
        getJogador().addEnergia(-3);
        System.out.println("--------------------------------");
        printStats("Jogando em dupla...");

        if (getJogador().getEnergia() < 10){
            getJogador().mudarEstado(new Dormindo(getJogador()));
        } else if (getJogador().getFelicidade() < 10) {
            getJogador().mudarEstado(new Dormindo(getJogador()));
        }
    }
}
