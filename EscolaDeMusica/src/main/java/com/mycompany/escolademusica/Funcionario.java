package com.mycompany.escolademusica;

public class Funcionario extends Pessoa implements Interface {
    private String numeroCracha;

    public Funcionario(String nome, int idade, String numeroCracha) {
        super(nome, idade);
        this.numeroCracha = numeroCracha;
    }

    @Override
    public void atividade() {
        System.out.println ("O funcionario esta exercendo suas funcoes administrativas");
    }

    @Override
    public String getId() {
        return numeroCracha;
    }
    
}
