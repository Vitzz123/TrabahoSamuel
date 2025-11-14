package com.Lista_de_tarefas.controller;

import com.Lista_de_tarefas.model.Lista_de_tarefas;
import com.Lista_de_tarefas.repository.Lista_de_tarefas_repository;


public class Lista_de_tarefas_controller {


    private Lista_de_tarefas_repository repository;

    public Lista_de_tarefas_controller(Lista_de_tarefas_repository repository) {
        this.repository = repository;
    }

    public void criarNovaTarefa(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            System.out.println("[Controller] Erro: Descrição não pode ser vazia.");
            return;
        }

        Lista_de_tarefas novaTarefa = new Lista_de_tarefas(descricao);

        repository.salvar(novaTarefa);
        
        System.out.println("[Controller] Ação 'criarNovaTarefa' concluída.");
    }
}
