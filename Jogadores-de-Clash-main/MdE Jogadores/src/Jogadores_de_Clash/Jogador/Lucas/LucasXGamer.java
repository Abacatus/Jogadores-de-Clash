package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.Jogador.José.Dormindo;
import Jogadores_de_Clash.Jogador.José.Jogando;
import Jogadores_de_Clash.Jogador.José.Vadiando;
import Jogadores_de_Clash.States.State;
import Jogadores_de_Clash.States.StateLucas;

public class LucasXGamer {

    private int energia = 100;
    public int getEnergia(){
        return energia;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_AZUL = "\u001B[34m";

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

    public void mudarEstado(StateLucas novoEstado){
        StateLucas estadoAnterior = this.state;

        estadoAnterior.leave();
        this.state = novoEstado;
        mostrarTransicao(estadoAnterior, novoEstado);
        this.state.enter();
    }

    private void mostrarTransicao(StateLucas anterior, StateLucas novo) {
        System.out.println(ANSI_AZUL + "I================================I" + ANSI_RESET);

        if (anterior instanceof LucasDormir && novo instanceof LucasJogar) {
            System.out.println(ANSI_AZUL + "LucasXGamer: Descansei já, partiu um Clash!" + ANSI_RESET);
        } else if (anterior instanceof LucasJogar && novo instanceof LucasDormir) {
            System.out.println(ANSI_AZUL + "LucasXGamer: Jogar Clash cansa muito, vou dormir" + ANSI_RESET);
        }
    }
}
