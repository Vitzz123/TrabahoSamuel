package com.Lista_de_tarefas.controller;

import com.Lista_de_tarefas.model.Lista_de_tarefas;
import com.Lista_de_tarefas.repository.Lista_de_tarefas_repository;

/**
 * JUSTIFICATIVA GRASP:
 *
 * 1. PADRÃO: Controller (Controlador)
 *
 * 2. POR QUÊ: Esta classe funciona como o "gerente" ou o "cérebro" da lógica.
 * Ela recebe os pedidos da 'Main' (nossa "interface") e coordena as ações.
 * É ela que decide o que fazer e manda o 'Repository' (os "dados") trabalhar.
 * Isso evita que a 'Main' e o 'Repository' conversem direto, mantendo
 * o código mais organizado (o tal do Baixo Acoplamento).
 *
 * 3. ONDE: Na classe inteira. O método 'criarNovaTarefa' é o exemplo perfeito,
 * pois ele recebe o pedido e "orquestra" todo o processo de validar
 * e mandar salvar a tarefa.
 */
public class Lista_de_tarefas_controller {


    private Lista_de_tarefas_repository repository;

    public Lista_de_tarefas_controller(Lista_de_tarefas_repository repository) {
        this.repository = repository;
    }

    //Método que vai criar uma tarefa
    public void criarNovaTarefa(String descricao) {
        // se nao tiver dedscrição, nao da pra salvar
        if (descricao == null || descricao.trim().isEmpty()) {
            System.out.println("[Controller] Erro: Descrição não pode ser vazia.");
            return;
        }

        // cria um novo objeto
        Lista_de_tarefas novaTarefa = new Lista_de_tarefas(descricao);

        // o repositorio que vai salvar
        repository.salvar(novaTarefa);
        
        System.out.println("[Controller] Ação 'criarNovaTarefa' concluída.");
    }
}