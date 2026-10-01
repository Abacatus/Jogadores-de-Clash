package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.States.StateLucas;

public class LucasJogar implements StateLucas {
    private LucasXGamer agente;
    public LucasJogar(LucasXGamer agente) {
        this.agente = agente;
    }

    public void enter() {
        System.out.println("I================================I");
        System.out.println("LucasXGamer: hora de subir um pouco!");
    }

    public void execute() {
        agente.addEnergia(-5);
        System.out.println("--------------------------------");
        System.out.println("LucasXGamer está jogando...");
        System.out.println("Energia: " + agente.getEnergia());

        if (agente.getEnergia() <= 0) {
            agente.mudarEstado(new LucasDormir(agente));
        }
    }

    public void leave() {
    }
}
