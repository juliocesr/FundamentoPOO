package org.program;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(getNome() + " está latindo");
    }
}
