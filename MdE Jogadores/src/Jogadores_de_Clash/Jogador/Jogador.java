package Jogadores_de_Clash.Jogador;

import Jogadores_de_Clash.States.State;

public class Jogador {
    private int felicidade = 100;
    private int energia = 100;

    private State state = new Jogando(this);

    public int getFelicidade() {return felicidade;}

    public void addFelicidade(int quantidade){
        this.felicidade += quantidade;
        this.felicidade = Math.min(this.felicidade, 100);
    }


    public int getEnergia(){return energia;}

    public void addEnergia(int quantidade){
        this.energia += quantidade;
        this.energia = Math.min(this.energia, 100);
    }

    public void update(){state.execute();}

    public void mudarEstado(State state){
        this.state.leave();
        this.state = state;
        state.enter();
    }
}