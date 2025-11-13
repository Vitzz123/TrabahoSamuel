// O pacote raiz do seu projeto
package com.Lista_de_tarefas;

// Importa as classes dos outros pacotes
import com.Lista_de_tarefas.controller.Lista_de_tarefas_controller;
import com.Lista_de_tarefas.repository.Lista_de_tarefas_repository;

public class Main {
    
    public static void main(String[] args) {
        // 1. "Inicialização do Sistema"
        // Criamos as instâncias necessárias (usando os nomes das suas classes)
        Lista_de_tarefas_repository meuRepositorio = new Lista_de_tarefas_repository();
        Lista_de_tarefas_controller meuController = new Lista_de_tarefas_controller(meuRepositorio);

        // 2. "Simulação de Interação do Usuário"
        
        System.out.println("--- Tentativa 1: Criar tarefa válida ---");
        // Cria uma tarefa com descrição
        meuController.criarNovaTarefa("Estudar GRASP para o trabalho");

        System.out.println("\n--- Tentativa 2: Criar tarefa inválida ---");
        meuController.criarNovaTarefa("    "); // Tenta criar tarefa vazia
    }
}