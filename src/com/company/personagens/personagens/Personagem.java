package com.company.personagens.personagens;

import com.company.personagens.comportamentos.Atacar;
import com.company.personagens.comportamentos.Correr;
import com.company.personagens.comportamentos.Pular;
import com.company.personagens.escudo.Escudos;
import com.company.personagens.inimigo.Observador;
import com.company.personagens.state.Normal;
import com.company.personagens.state.State;

import java.util.ArrayList;

public abstract class Personagem implements Sujeito {
    private String nome;

    public Personagem(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.life = 70;
        this.setState(new Normal(this));
    }


    //chain of responsabily
    private Escudos escudo;

    public void dano(int dano) {
        if (escudo == null) {
            this.state.perderLife(dano);
        } else {
            escudo.processaDano(dano, this);
        }
    }

    //Observer
    private int x, y;
    private ArrayList<Observador> lista = new ArrayList<>();

    public void andar(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void addObserver(Observador o) {
        lista.add(o);
    }

    @Override
    public void removeObserver(Observador o) {
        lista.remove(o);
    }

    public void notifyObservers() {//Faz os observadores andarem
        getLista().forEach(e -> e.update(this));
    }

    public void notifyObserversAtaque() {//quando eu aperto espaço, chama essa função.
        lista.forEach(e -> e.updateAtaque(this));
    }


    //State
    public void perderLife(int n) {
        state.perderLife(n);
    }

    public void ganharLife(int n) {
        state.ganharLife(n);
    }

    private State state;
    private int life;


    //Strategy
    private Atacar atacar;
    private Correr correr;
    private Pular pular;

    public int atacar() {
        return atacar.getDano();
    }

    public int pular() {
        return pular.pular();
    }

    public int correr() {
        return correr.correr();
    }

    //Getters && Setters
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setAtacar(Atacar atacar) {
        this.atacar = atacar;
    }

    public void setCorrer(Correr correr) {
        this.correr = correr;
    }

    public void setPular(Pular pular) {
        this.pular = pular;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Observador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Observador> lista) {
        this.lista = lista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escudos getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudos escudo) {
        this.escudo = escudo;
    }

    public Atacar getAtacar() {
        return atacar;
    }
}
