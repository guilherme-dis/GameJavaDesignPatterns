package main.personagem.handler.concretehandler;

import main.personagem.handler.Escudos;

public class Escudo50 extends Escudos {
    private int escudo = 50;

    @Override
    public void processaDano(int dano) {
        if (this.escudo <= 0) {
            getSucessor().processaDano(dano);
        } else {
            this.escudo -= dano;
            if (escudo < 0) {
                System.out.println("O escudo de 50 QUEBROU");
                getSucessor().processaDano(escudo * -1);
                this.escudo = 0;
            } else System.out.println("O escudo de 50 aguentou e ficou com: " + this.escudo);
        }
    }
}
