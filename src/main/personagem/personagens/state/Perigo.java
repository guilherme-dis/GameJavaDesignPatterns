package main.personagem.personagens.state;

import main.personagem.personagens.classesimplement.AtacarFraco;
import main.personagem.personagens.classesimplement.CorrerDevagar;
import main.personagem.personagens.Personagem;

public class Perigo extends State {
    public Perigo(Personagem context) {
        super(context);
        getPersonagem().setAtacar(new AtacarFraco());
        getPersonagem().setCorrer(new CorrerDevagar());
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
