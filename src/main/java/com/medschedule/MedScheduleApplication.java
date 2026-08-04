package com.medschedule;

import com.medschedule.strategy.AtaqueArco;
import com.medschedule.strategy.AtaqueEspada;
import com.medschedule.strategy.AtaqueMagia;
import com.medschedule.strategy.Personagem;

public class MedScheduleApplication {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO O SISTEMA DE COMBATE (STRATEGY) ---");

        // 1. Criamos o nosso herói desarmado
        Personagem jogador = new Personagem();
        jogador.atacar();

        System.out.println("\n[Acao] Jogador encontrou e equipou uma Espada...");
        // 2. Mudamos a estratégia para Espada
        jogador.setEstrategiaAtaque(new AtaqueEspada());
        jogador.atacar();

        System.out.println("\n[Acao] Um dragao voador apareceu longe! Jogador mudou para o Arco...");
        // 3. Mudamos a estratégia em tempo de execução para Arco
        jogador.setEstrategiaAtaque(new AtaqueArco());
        jogador.atacar();

        System.out.println("\n[Acao] O Arco quebrou! Jogador usou um pergaminho de Magia...");
        // 4. Mudamos dinamicamente para Magia
        jogador.setEstrategiaAtaque(new AtaqueMagia());
        jogador.atacar();

        System.out.println("\n--- FIM DO COMBATE ---");
    }
}