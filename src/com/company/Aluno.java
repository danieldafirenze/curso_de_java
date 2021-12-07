package com.company;

public class Aluno {
    private String nome;
    private int idade;
    private int ano;

    public Aluno() {
    }

    public Aluno(String nome, int idade, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", ano=" + this.ano +
                '}';
    }
}
