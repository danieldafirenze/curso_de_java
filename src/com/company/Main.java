package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        String nome;
        int idade, ano;

        System.out.println("Diga o nome do aluno: ");
        nome = scanner.next();
        aluno.setNome(nome);


        System.out.println("Diga a idade desse aluno: ");
        idade = scanner.nextInt();
        aluno.setIdade(idade);

        System.out.println("Diga o ano que ele está (série): ");
        aluno.setAno(scanner.nextInt());

        System.out.println(aluno);
    }
}
