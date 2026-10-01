package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.States.StateLucas;

public class LucasXGamer {

    private int energia = 100;
    public int getEnergia(){
        return energia;
    }

    public void addEnergia(int quantidade) {
        energia += quantidade;

        if (energia > 100) {
            energia = 100;
        }
        if (energia < 0) {
            energia = 0;
        }
    }

    private StateLucas state = new LucasJogar(this);

    public void update(){
        state.execute();
    }

    public void mudarEstado(StateLucas state){
        if (this.state != null) {
            this.state.leave();
        }

        this.state = state;

        if (this.state != null) {
            this.state.enter();
        }
    }


}
