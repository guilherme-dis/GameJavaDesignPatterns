package com.company.personagens.state;

import com.company.personagens.comportamentos.comportamentosconcretos.AtaqueFraco;
import com.company.personagens.comportamentos.comportamentosconcretos.CorridaDevagar;
import com.company.personagens.comportamentos.comportamentosconcretos.PuloBaixo;
import com.company.personagens.personagens.Personagem;

public class Perigo extends State {
    public Perigo(Personagem personagem) {
        super(personagem);
        getPersonagem().setAtacar(new AtaqueFraco());
        getPersonagem().setCorrer(new CorridaDevagar());
        getPersonagem().setPular(new PuloBaixo());

        getPersonagem().setCusto(personagem.atacar());
    }

    @Override
    protected void setLimites() {
        this.setLimiteInferior(1);
        this.setLimiteSuperior(29);
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if (getPersonagem().getLife() < getLimiteInferior()) {
            this.getPersonagem().setState(new Morto(this.getPersonagem()));
            this.getPersonagem().getState().verificarAlteracaoEstado();
        } else if (getPersonagem().getLife() > getLimiteSuperior()) {
            this.getPersonagem().setState(new Normal(this.getPersonagem()));
            this.getPersonagem().getState().verificarAlteracaoEstado();
        }

    }
}
