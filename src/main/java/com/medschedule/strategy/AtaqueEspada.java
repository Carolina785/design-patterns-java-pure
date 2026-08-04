package com.medschedule.strategy;

public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public void executarAtaque() {
        System.out.println("O guerreiro golpeia com a espada! Dano fisico causado.");
    }
}