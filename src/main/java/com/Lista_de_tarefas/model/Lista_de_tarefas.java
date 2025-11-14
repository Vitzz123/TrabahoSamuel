package com.Lista_de_tarefas.model;

public class Lista_de_tarefas {
    private String descricao;
    private boolean concluida;

    public Lista_de_tarefas(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Lista_de_tarefas [descricao=" + descricao + ", concluida=" + concluida + "]";
    }
}
