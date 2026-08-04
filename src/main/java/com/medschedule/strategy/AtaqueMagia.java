package com.medschedule.strategy;

public class AtaqueMagia implements EstrategiaAtaque {
    @Override
    public void executarAtaque() {
        System.out.println("O mago lanca uma bola de fogo! Dano magico causado.");
    }
}
