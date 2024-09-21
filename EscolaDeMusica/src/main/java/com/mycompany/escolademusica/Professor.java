package com.mycompany.escolademusica;

public class Professor extends Pessoa implements Interface {
    private String registroFuncional;

    public Professor(String nome, int idade, String registroFuncional) {
        super(nome, idade);
        this.registroFuncional = registroFuncional;
    }

    @Override
    public void atividade() {
        System.out.println("Professor esta ministrando aula de musica");
    }

    @Override
    public String getId() {
        return registroFuncional;
    }
    
}
