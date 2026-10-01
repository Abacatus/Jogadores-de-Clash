package Jogadores_de_Clash.Jogador.Lucas;

import Jogadores_de_Clash.States.StateLucas;

public class LucasDormir implements StateLucas {
    private LucasXGamer agente;
    public LucasDormir(LucasXGamer agente) {
        this.agente = agente;
    }

    public void enter(){
        System.out.println("I================================I");
        System.out.println("LucasXGamer: eita que sono...");
    }

    public void execute(){
        agente.addEnergia(15);
        System.out.println("--------------------------------");
        System.out.println("LucasXGamer está dormindo...");
        System.out.println("Energia: " + agente.getEnergia());

        if (agente.getEnergia() >= 90) {
            agente.mudarEstado(new LucasJogar(agente));
        }

    }

    public void leave(){
    }
}
