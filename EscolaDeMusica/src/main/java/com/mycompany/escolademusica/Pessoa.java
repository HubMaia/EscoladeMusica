package com.mycompany.escolademusica;

public abstract class Pessoa {    
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade (){
        return idade;
    }
    //esse metodo é abstrato e vai ser jogado no void de acordo com cada profissao
    public abstract void atividade();
}
