package Jogadores_de_Clash.Jogador.José;

import Jogadores_de_Clash.States.State;

public class Jogador {
    private int felicidade = 100;
    private int energia = 100;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_VERDE = "\u001B[32m";

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

    public void mudarEstado(State novoEstado){
        State estadoAnterior = this.state;

        estadoAnterior.leave();
        this.state = novoEstado;
        mostrarTransicao(estadoAnterior, novoEstado);
        this.state.enter();
    }

    private void mostrarTransicao(State anterior, State novo) {
        System.out.println("\u001B[32mI================================I\u001B[0m");

        if (anterior instanceof Dormindo && novo instanceof Jogando) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Já descansei, bora jogar um pouco..." + ANSI_RESET);
        } else if (anterior instanceof Jogando && novo instanceof Dormindo) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Cansei, vou dormir..." + ANSI_RESET);
        } else if (anterior instanceof Jogando && novo instanceof Vadiando) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Já joguei o suficiente..." + ANSI_RESET);
        } else if (anterior instanceof Vadiando && novo instanceof Jogando) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Já que tô fazendo nada, bora jogar!" + ANSI_RESET);
        } else if (anterior instanceof Vadiando && novo instanceof Dormindo) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Essa preguiça me deu sono..." + ANSI_RESET);
        } else if (anterior instanceof Dormindo && novo instanceof Vadiando) {
            System.out.println(ANSI_VERDE + "XxJoséKillerxX: Não tô com vontade de jogar ainda..." + ANSI_RESET);
        }
    }

}