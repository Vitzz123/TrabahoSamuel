package com.Lista_de_tarefas.repository;

// Importa a sua classe de modelo
import com.Lista_de_tarefas.model.Lista_de_tarefas;
import java.util.ArrayList;
import java.util.List;

/**
 * JUSTIFICATIVA DE PRINCÍPIO GRASP:
 *
 * 1. PADRÃO UTILIZADO: High Cohesion (Alta Coesão)
 *
 * 2. POR QUE ATENDE AO PRINCÍPIO:
 * Esta classe tem uma responsabilidade única e bem definida: gerenciar
 * o armazenamento e recuperação de objetos 'Lista_de_tarefas'.
 * Ela não se preocupa com regras de negócio (como validar a descrição)
 * nem com a interface do usuário (como pedir dados ao usuário).
 * Toda a lógica de "banco de dados" (aqui simulado por uma Lista)
 * está coesa em um único lugar.
 *
 * 3. ONDE FOI APLICADO:
 * Na própria classe 'Lista_de_tarefas_repository'. Os métodos 'salvar' e 'listarTodas'
 * são exemplos claros dessa responsabilidade focada.
 */
public class Lista_de_tarefas_repository {
    
    // Simula um "banco de dados" em memória
    private List<Lista_de_tarefas> bancoDeDados = new ArrayList<>();

    public void salvar(Lista_de_tarefas tarefa) {
        bancoDeDados.add(tarefa);
        System.out.println("[Repo] Tarefa salva: " + tarefa.getDescricao());
    }

    public List<Lista_de_tarefas> listarTodas() {
        return bancoDeDados;
    }
}