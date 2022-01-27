package com.company.personagens.escudo;

import com.company.personagens.personagens.Personagem;

public abstract class Escudos {
    private Escudos sucessor;

    public Escudos getSucessor() {
        return sucessor;
    }
    public void setSucessor(Escudos sucessor) {
        this.sucessor = sucessor;
    }
    public abstract void processaDano(int dano, Personagem personagem);
}
