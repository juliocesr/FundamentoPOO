package org.program;

public class Main {
    public static void ligarEquipamento(Equipamento equipamento) {
        equipamento.ligar();
    }

    public static void main(String[] args) {
        Personagem tripulante = new Personagem("vermelho", "luffy", "pirata");
        tripulante.correr();

        Pessoa objeto = new Pessoa();
        objeto.setNome("Ussop");
        System.out.println("O nome da pessoa é " + objeto.getNome());

        Cachorro meuCachorro = new Cachorro("Rex");
        meuCachorro.comer();
        meuCachorro.dormir();
        meuCachorro.latir();

        Equipamento TV = new TV();
        Equipamento arCondicionado = new ArCondicionado();
        Equipamento lampadas = new Lampada();

        ligarEquipamento(TV);
        ligarEquipamento(arCondicionado);
        ligarEquipamento(lampadas);
    }
}