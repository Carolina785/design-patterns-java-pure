package com.medschedule.strategy;

public class Personagem {
    // Guarda a estratégia de ataque atual (isso é o coração do Design Pattern Strategy!)
    private EstrategiaAtaque estrategiaAtaque;

    // Método que permite mudar de arma/ataque a qualquer momento no jogo
    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        if (estrategiaAtaque == null) {
            System.out.println("O personagem esta desarmado e nao pode atacar!");
        } else {
            estrategiaAtaque.executarAtaque();
        }
    }
}