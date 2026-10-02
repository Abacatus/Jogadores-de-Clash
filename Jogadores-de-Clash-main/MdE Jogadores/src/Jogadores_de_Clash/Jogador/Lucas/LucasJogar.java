package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.States.StateLucas;

public class LucasJogar implements StateLucas {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_AZUL = "\u001B[34m";

    private LucasXGamer agente;
    public LucasJogar(LucasXGamer agente) {
        this.agente = agente;
    }

    public void enter() {
        System.out.println(ANSI_AZUL + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer: hora de subir um pouco!" + ANSI_RESET);
    }

    public void execute() {
        agente.addEnergia(-5);
        System.out.println(ANSI_AZUL + "--------------------------------" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer está jogando..." + ANSI_RESET);
        System.out.println(ANSI_AZUL + "Energia: " + agente.getEnergia() + ANSI_RESET);

        if (agente.getEnergia() <= 0) {
            agente.mudarEstado(new LucasDormir(agente));
        }
    }

    public void leave() {
        System.out.println(ANSI_AZUL + "I================================I" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "LucasXGamer: Cansei de perder..." + ANSI_RESET);
    }

    public void transicao() {
    }
}
