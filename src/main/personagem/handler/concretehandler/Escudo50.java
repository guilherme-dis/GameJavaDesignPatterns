package main.personagem.handler.concretehandler;

import main.personagem.handler.Escudos;
import main.personagem.personagens.Personagem;

public class Escudo50 extends Escudos {
    private int escudo = 50;

    @Override
    public void processaDano(int dano, Personagem personagem) {
        if (this.escudo <= 0) {
            if (getSucessor() != null)
                getSucessor().processaDano(dano, personagem);
        } else {
            this.escudo -= dano;
            if (escudo <=0) {
                System.out.println("O escudo de 50 QUEBROU");
                if (getSucessor() == null) {
                    personagem.setEscudo(null);
                    personagem.getState().dano(escudo * -1);
                } else {
                    getSucessor().processaDano(escudo * -1, personagem);
                    this.escudo = 0;
                }
            } else System.out.println("O escudo de 50 aguentou e ficou com: " + this.escudo);
        }
    }
}
