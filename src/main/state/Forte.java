package main.state;

import main.personagem.classesimplement.AtacarForte;
import main.personagem.classesimplement.CorrerRapido;
import main.personagem.personagens.Personagem;

public class Forte extends State {
    public Forte(Personagem context) {
        super(context);
        getPersonagem().setAtacar(new AtacarForte());
        getPersonagem().setCorrer(new CorrerRapido());
    }

    @Override
    protected void setLimites() {
        this.setLimiteInferior(70);
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
