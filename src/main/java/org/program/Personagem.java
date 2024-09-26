package org.program;

public class Personagem {
    private String corDaRoupa;
    private String nome;
    private String categoriaDoPersonagem;
    private boolean correr;

    public Personagem(String corDaRoupa, String nome, String categoriaDoPersonagem) {
        this.corDaRoupa = corDaRoupa;
        this.nome = nome;
        this.categoriaDoPersonagem = categoriaDoPersonagem;
        this.correr = false;
    }

    public void correr() {
        if (!this.correr) {
            System.out.println("Personagem começou correr");
            this.correr = true;
        } else {
            System.out.println("Personagem já está correndo");
        }
    }

}
