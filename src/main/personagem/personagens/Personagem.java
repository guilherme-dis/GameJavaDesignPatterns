package main.personagem.personagens;

import main.personagem.handler.concretehandler.EncapsulaEscudo;
import main.personagem.inimigo.Inimigo;
import main.personagem.personagens.interfaces.Atacar;
import main.personagem.personagens.interfaces.Correr;
import main.personagem.personagens.interfaces.Pular;
import main.personagem.personagens.state.Normal;
import main.personagem.personagens.state.State;

import java.util.ArrayList;
import java.util.Observable;

public abstract class Personagem extends Observable {
    private State state;
    private Integer life;

    private int x;
    private int y;






    ArrayList<Inimigo> inimigos = new ArrayList<>();

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public void adicionaInimigos(Inimigo inimigo){
        this.inimigos.add(inimigo);
        this.addObserver(inimigo);
    }
    public void deletaInimigos(Inimigo inimigo){
        this.inimigos.remove(inimigo);
        this.deleteObserver(inimigo);
    }

    public void andar(int x, int y){
        this.x+=x;
        this.y+=y;
        setChanged();
        notifyObservers();
    }


    public void notifyObserversAtaque(){
        //getInimigos().forEach(inimigo -> inimigo.updateAtaque(this));
        for (Inimigo i :
                getInimigos()) {
            i.updateAtaque(this);
        }
    }




    public void show(){
        setChanged();
        notifyObservers();
    }


    private Atacar atacar;
    private Correr correr;
    private Pular pular;

     public Personagem(int x,int y){
         this.state = new Normal(this);
         this.life = 69;
         this.x=x;
         this.y=y;
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

    public void atacar(){
        atacar.atacar();
    }
    public void pular(){
        pular.pular();
    }
    public void correr(){
        correr.correr();
    }

    public void ganhoDeVida(int i){
         this.state.ganhoDeVida(i);
    }
    public void dano(int i){
         this.state.dano(i);
    }
    public void solicitaDano(int i){

    }

    public Integer getLife(){
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
}
