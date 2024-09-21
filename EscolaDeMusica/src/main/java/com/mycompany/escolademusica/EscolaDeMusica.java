package com.mycompany.escolademusica;
import java.util.ArrayList;

public class EscolaDeMusica {

    public static void main(String[] args) {
        // Criação de instâncias de Aluno, Professor e Funcionario
        Aluno aluno1 = new Aluno("Jose", 12, "1234");
        Professor professor1 = new Professor("Wagner", 58, "4321");
        Funcionario funcionario1 = new Funcionario("Roberto", 61, "2314");
        
        // Criar lista de Pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno1);
        pessoas.add(professor1);
        pessoas.add(funcionario1);
        
        // Percorrer a lista e utilizar polimorfismo para chamar atividade e identificador
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
            pessoa.atividade();  // Polimorfismo
            System.out.println("Identificador: " + ((Interface) pessoa).getId());
            System.out.println();
        }
    }
}

