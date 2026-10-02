package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.States.StateLucas;

public class LucasDormir implements StateLucas {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_AZUL = "\u001B[34m";

    private LucasXGamer agente;
    public LucasDormir(LucasXGamer agente) {
        this.agente = agente;
    }

    public void enter(){
        System.out.println(ANSI_AZUL + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer: eita que sono..." + ANSI_RESET);
    }

    public void execute(){
        agente.addEnergia(15);
        System.out.println(ANSI_AZUL + "--------------------------------" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer está dormindo..." + ANSI_RESET);
        System.out.println(ANSI_AZUL + "Energia: " + agente.getEnergia() + ANSI_RESET);

        if (agente.getEnergia() >= 90) {
            agente.mudarEstado(new LucasJogar(agente));
        }

    }

    public void leave(){
        System.out.println(ANSI_AZUL + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer: Hora de acordar!" + ANSI_RESET);
    }

    public void transicao() {
    }
}
