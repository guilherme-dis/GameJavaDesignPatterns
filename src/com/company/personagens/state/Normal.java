package com.company.personagens.state;

import com.company.personagens.comportamentos.comportamentosconcretos.AtaqueMedio;
import com.company.personagens.comportamentos.comportamentosconcretos.CorridaMedio;
import com.company.personagens.comportamentos.comportamentosconcretos.PuloMedio;
import com.company.personagens.personagens.Personagem;

public class Normal extends State {

    public Normal(Personagem personagem) {
        super(personagem);
        getPersonagem().setAtacar(new AtaqueMedio());
        getPersonagem().setCorrer(new CorridaMedio());
        getPersonagem().setPular(new PuloMedio());
        getPersonagem().setCusto(personagem.atacar());
    }
    @Override
    protected void setLimites() {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }
    @Override
    protected void verificarAlteracaoEstado() {
        if (getPersonagem().getLife() < getLimiteInferior()) {
            this.getPersonagem().setState(new Perigo(this.getPersonagem()));
            this.getPersonagem().getState().verificarAlteracaoEstado();
        }else if(getPersonagem().getLife() > getLimiteSuperior()){
            this.getPersonagem().setState(new Forte(this.getPersonagem()));
            this.getPersonagem().getState().verificarAlteracaoEstado();
        }

    }
}
