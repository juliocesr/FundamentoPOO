package org.program;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " está comendo");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo");
    }

    public String getNome() {
        return nome;
    }
}
