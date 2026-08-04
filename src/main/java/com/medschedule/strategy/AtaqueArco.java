package com.medschedule.strategy;

public class AtaqueArco implements EstrategiaAtaque {
    @Override
    public void executarAtaque() {
        System.out.println("O arqueiro dispara uma flecha certeira! Dano a distancia causado.");
    }
}
