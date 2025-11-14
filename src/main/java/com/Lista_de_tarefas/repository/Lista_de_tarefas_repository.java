package com.Lista_de_tarefas.repository;

import com.Lista_de_tarefas.model.Lista_de_tarefas;
import java.util.ArrayList;
import java.util.List;


public class Lista_de_tarefas_repository {
    
    private List<Lista_de_tarefas> bancoDeDados = new ArrayList<>();

    public void salvar(Lista_de_tarefas tarefa) {
        bancoDeDados.add(tarefa);
        System.out.println("[Repo] Tarefa salva: " + tarefa.getDescricao());
    }

    public List<Lista_de_tarefas> listarTodas() {
        return bancoDeDados;
    }
}
