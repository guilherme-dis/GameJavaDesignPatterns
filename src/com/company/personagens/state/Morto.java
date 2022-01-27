package com.company.personagens.state;

import com.company.personagens.personagens.Personagem;

public class Morto extends State {
    public Morto(Personagem personagem) {
        super(personagem);
        getPersonagem().setAtacar(null);
        getPersonagem().setPular(null);
        getPersonagem().setCorrer(null);
        System.out.println("morreu");
        System.exit(0);
    }

    @Override
    protected void setLimites() {

    }

    @Override
    protected void verificarAlteracaoEstado() {

    }
}
