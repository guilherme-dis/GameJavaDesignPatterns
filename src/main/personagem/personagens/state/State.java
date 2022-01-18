package main.personagem.personagens.state;

import main.personagem.personagens.Personagem;

public abstract class State {
    private Personagem personagem;
    private Integer limiteInferior;
    private Integer limiteSuperior;

    public State(Personagem personagem) {
        this.personagem = personagem;
        setLimites();
    }

    public void dano(int i) {
        this.personagem.setLife(this.personagem.getLife() - i);
        this.verificarAlteracaoEstado();
    }

    public void ganhoDeVida(int i) {
        this.personagem.setLife(this.personagem.getLife() + i);
        this.verificarAlteracaoEstado();
    }

    protected abstract void setLimites();

    protected abstract void verificarAlteracaoEstado();

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Integer getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(Integer limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Integer getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(Integer limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

}
