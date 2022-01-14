package main.personagem.personagens;

import main.personagem.inimigo.Inimigo;
import main.personagem.interfaces.Atacar;
import main.personagem.interfaces.Correr;
import main.personagem.interfaces.Pular;
import main.state.Normal;
import main.state.State;

import java.util.ArrayList;

public abstract class Personagem implements PersonagemObserver{
    private State state;
    private Integer life;

    private int x;
    private int y;

    private Boolean alertaSonoro = false;
    private final ArrayList observadores=new ArrayList();

    public void alterarAlerta() {
        alertaSonoro = !alertaSonoro;
        notificarObservadores();
    }
    public Boolean getAlerta() {
        return alertaSonoro;
    }

    public void adicionarObservador(Inimigo o) {
        observadores.add(o);
    }

    public void removerObservador(Inimigo o) {
        observadores.remove(o);
    }

    private void notificarObservadores() {
        for (Object observadore : observadores) {
            Inimigo o = (Inimigo) observadore;
            o.atualizar(this);
        }
    }
    public void andar(int x,int y){
        this.x+=x;
        this.y+=y;
        notificarObservadores();
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
