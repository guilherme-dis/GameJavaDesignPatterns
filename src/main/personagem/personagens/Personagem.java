package main.personagem.personagens;

import main.personagem.handler.Escudos;
import main.personagem.inimigo.Observador;
import main.personagem.personagens.atributos.Atacar;
import main.personagem.personagens.atributos.Correr;
import main.personagem.personagens.atributos.Pular;
import main.personagem.personagens.state.Normal;
import main.personagem.personagens.state.State;

import java.util.ArrayList;

public abstract class Personagem implements Sujeito{
    private Atacar atacar;
    private Correr correr;
    private Pular pular;
    private State state;
    private Integer life;
    private ArrayList<Observador> lista = new ArrayList<>();
    private int x;
    private int y;
    private Escudos escudo;

    public Personagem(int x, int y) {
        this.state = new Normal(this);
        this.life = 69;
        this.x = x;
        this.y = y;
    }

    public void dano(int dano) {
        if (escudo == null) {
            this.state.dano(dano);
        } else {
            escudo.processaDano(dano, this);
        }
    }

    public void andar(int x, int y) {
        this.x += x;
        this.y += y;
        notifyObservers();
    }

    @Override
    public void addObserver(Observador o) {
        lista.add(o);
    }

    @Override
    public void removeObserver(Observador o) {
        lista.remove(o);
    }

    public void notifyObservers() {
        getLista().forEach(e->e.update(this));
    }

    public void notifyObserversAtaque() {
        lista.forEach(e->e.updateAtaque(this));
//        getInimigos().forEach(e->e.updateAtaque(this));
//        for (Observador i : getLista()){
//            i.updateAtaque(this);
//        }
    }


    public void show() {
        notifyObservers();
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

    public int atacar() {
       return atacar.atacar();
    }

    public void pular() {
        pular.pular();
    }

    public void correr() {
        correr.correr();
    }

    public void ganhoDeVida(int i) {
        this.state.ganhoDeVida(i);
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
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

    public Escudos getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudos escudo) {
        this.escudo = escudo;
    }
}
