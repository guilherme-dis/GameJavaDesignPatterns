package com.company.personagens.state;

import com.company.personagens.personagens.Personagem;

public abstract class State {
    private Personagem personagem;
    private Integer limiteInferior;
    private Integer limiteSuperior;

    public State(Personagem personagem) {
        this.personagem = personagem;
        setLimites();
    }

    public void perderLife(int life) {
        this.personagem.setLife(this.personagem.getLife() - life);
        this.verificarAlteracaoEstado();
    }
    public void ganharLife(int life) {
        this.personagem.setLife(this.personagem.getLife() + life);
        this.verificarAlteracaoEstado();
    }

    protected abstract void setLimites();//Cada classe que herda tem que ter o seu limite

    protected abstract void verificarAlteracaoEstado();//cada classe tem a sua própria alteração

    //GETTERS && SETTERS
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
