package Jogadores_de_Clash.States;

import Jogadores_de_Clash.Jogador.Jogador;

public interface State {
    Jogador getJogador();
    void printStats(String status);

    void enter();
    void execute();
    void leave();
}
