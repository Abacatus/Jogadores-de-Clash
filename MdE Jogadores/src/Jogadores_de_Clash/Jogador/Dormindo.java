package Jogadores_de_Clash.Jogador;

import Jogadores_de_Clash.States.AbstractState;

public class Dormindo extends AbstractState {

    public Dormindo(Jogador jogador) {super(jogador);}

    public void enter(){
        System.out.println("I================================I");
        System.out.println("Melhor eu descansar...");
    }

    public void execute(){
        getJogador().addFelicidade(1);
        getJogador().addEnergia(15);
        System.out.println("--------------------------------");
        printStats("Zzzzzzzz...");

        if (getJogador().getEnergia() >= 100){
            if (getJogador().getFelicidade() >= 70){
                getJogador().mudarEstado(new Jogando(getJogador()));
            } else {
                getJogador().mudarEstado(new Vadiando(getJogador()));
            }
        }
    }
}
