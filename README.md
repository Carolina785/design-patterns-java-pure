# 🎮 RPG Combat System - Design Pattern Strategy

Este projeto foi desenvolvido como desafio final do módulo de Padrões de Projeto (Design Patterns) da DIO (Digital Innovation One). O objetivo principal é consolidar o aprendizado prático sobre padrões comportamentais utilizando **Java Puro**, sem a complexidade de frameworks.

## 🧠 O Padrão Utilizado: Strategy

A aplicação simula um sistema de combate de RPG onde o personagem principal consegue alterar sua estratégia de ataque dinamicamente em tempo de execução, dependendo da arma equipada.

### ❌ O Problema sem o Padrão
Sem o padrão *Strategy*, o método `atacar()` da classe `Personagem` precisaria de uma estrutura complexa e engessada de condicionais (`if/else` ou `switch/case`) para verificar qual arma está ativa. Cada nova arma adicionada exigiria modificar a classe principal, gerando alto acoplamento e quebrando o código existente.

### ⚖️ A Solução com o Padrão
Criamos uma interface comum (`EstrategiaAtaque`) e isolamos cada comportamento de ataque em sua própria classe (`AtaqueEspada`, `AtaqueArco`, `AtaqueMagia`). A classe `Personagem` apenas armazena uma referência para a interface e delega a execução do ataque, sem precisar saber *como* ele funciona internamente.

## 🛠️ Benefícios Técnicos do Projeto

* **Princípio Open/Closed (SOLID):** O sistema está aberto para expansão e fechado para modificação. Se quisermos criar um "AtaqueComAdaga", basta criar uma nova classe que implementa a interface. O código da classe `Personagem` continua 100% intacto.
* **Baixo Acoplamento:** A classe de contexto não conhece os detalhes de implementação das armas, apenas a abstração da interface.
* **Flexibilidade:** O comportamento de um mesmo método muda completamente durante a execução do programa de forma transparente.

## 🚀 Como Executar

Por utilizar Java Puro, o projeto não possui dependências externas ou configurações complexas:

1. Clone o repositório.
2. Abra em sua IDE de preferência (desenvolvido utilizando IntelliJ IDEA).
3. Execute a classe principal `MedScheduleApplication.java`.

---
Desenvolvido por Carolina Feliciano para fins de estudo e portfólio.
