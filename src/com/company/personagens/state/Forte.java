package com.company.personagens.state;

import com.company.personagens.comportamentos.comportamentosconcretos.AtaqueForte;
import com.company.personagens.comportamentos.comportamentosconcretos.CorridaRapido;
import com.company.personagens.comportamentos.comportamentosconcretos.PuloAlto;
import com.company.personagens.personagens.Personagem;

public class Forte extends State {
    public Forte(Personagem personagem) {
        super(personagem);
        getPersonagem().setAtacar(new AtaqueForte());
        getPersonagem().setCorrer(new CorridaRapido());
        getPersonagem().setPular(new PuloAlto());

    }

    @Override
    protected void setLimites() {
        this.setLimiteInferior(71);
        this.setLimiteSuperior(100);
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if (getPersonagem().getLife() < getLimiteInferior()) {
            this.getPersonagem().setState(new Normal(this.getPersonagem()));
            this.getPersonagem().getState().verificarAlteracaoEstado();
        }

    }
}
