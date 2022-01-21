package main.personagem.personagens.state;

import main.personagem.personagens.Personagem;
import main.personagem.personagens.atributos.tipos.AtacarMedio;
import main.personagem.personagens.atributos.tipos.CorrerMedio;

public class Normal extends State {

    public Normal(Personagem personagem) {
        super(personagem);
        getPersonagem().setAtacar(new AtacarMedio());
        getPersonagem().setCorrer(new CorrerMedio());
    }
    @Override
    protected void setLimites() {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(69);
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
