package main.personagem.handler.concretehandler;

import main.personagem.handler.Escudos;

public class Escudo75 extends Escudos {
    private int escudo = 75;

    @Override
    public void processaDano(int dano) {
        if (this.escudo <= 0) {
            getSucessor().processaDano(dano);
        } else {
            this.escudo -= dano;
            if (escudo < 0) {
                System.out.println("O escudo de 75 QUEBROU");
                getSucessor().processaDano(escudo * -1);
                this.escudo = 0;
            } else System.out.println("O escudo de 75 aguentou e ficou com: " + this.escudo);
        }
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
