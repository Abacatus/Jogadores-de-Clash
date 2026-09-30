package Jogadores_de_Clash;

import Jogadores_de_Clash.Jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        int loops = 50;

        Jogador jogador1 = new Jogador();

        while(loops > 0) {
            jogador1.update();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            loops--;
        }
    }
}
