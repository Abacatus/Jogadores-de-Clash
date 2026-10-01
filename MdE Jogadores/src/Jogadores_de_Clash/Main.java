package Jogadores_de_Clash;

import Jogadores_de_Clash.Jogador.José.Jogador;
import Jogadores_de_Clash.Jogador.Lucas.LucasXGamer;

public class Main {
    public static void main(String[] args) {
        int loops = 50;

        Jogador jose = new Jogador();
        LucasXGamer lucas = new LucasXGamer();

        while(loops > 0) {
            jose.update();
            lucas.update();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            loops--;
        }
    }
}
