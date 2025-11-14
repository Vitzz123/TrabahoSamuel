package com.Lista_de_tarefas;

import com.Lista_de_tarefas.controller.Lista_de_tarefas_controller;
import com.Lista_de_tarefas.repository.Lista_de_tarefas_repository;

public class Main {
    
    public static void main(String[] args) {

        Lista_de_tarefas_repository meuRepositorio = new Lista_de_tarefas_repository();
        Lista_de_tarefas_controller meuController = new Lista_de_tarefas_controller(meuRepositorio);


        
        System.out.println("--- Tentativa 1: Criar tarefa válida ---");
        meuController.criarNovaTarefa("Estudar GRASP para o trabalho");

        System.out.println("\n--- Tentativa 2: Criar tarefa inválida ---");
        meuController.criarNovaTarefa("    ");
    }
}
