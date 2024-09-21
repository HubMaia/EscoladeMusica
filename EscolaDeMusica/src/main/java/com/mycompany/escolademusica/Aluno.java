package com.mycompany.escolademusica;

public class Aluno extends Pessoa implements Interface {
    private String numeroMatricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.numeroMatricula = matricula;
    }

    @Override
    public void atividade() {
        System.out.println("Aluno esta praticando e tocando instrumentos");
    }

    @Override
    public String getId() {
        return numeroMatricula;
    }
    
}
