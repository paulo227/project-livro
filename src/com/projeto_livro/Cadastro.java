package com.projeto_livro;
public class Cadastro {
    public static void main(String[] args) {

        Pessoa[] p1 = new Pessoa[2];
        Livro[] l1 = new Livro[3];
        p1[0] = new Pessoa("CARLOS", 25, "M");
        p1[1] = new Pessoa("MARIA", 52, "F");

        l1[0] = new Livro("Banco de dados", "Gustavo", 200, p1[0]);
        l1[1] = new Livro("Java", "felipe", 500, p1[1]);
        l1[2] = new Livro("HTML", "Carlos", 100, p1[0]);

        l1[0].abrir();
        l1[0].folhear(100);
        l1[0].avancarPag();
        l1[0].voltarPag();
        System.out.println(l1[0].detalhes());

        System.out.println("=================");

        System.out.println(l1[1].detalhes());
    }
}
