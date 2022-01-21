package main.personagem.inimigo;

import main.personagem.personagens.Personagem;

import java.util.Observable;
import java.util.Observer;

public class Inimigo implements Observer {

    private String nome;
    private Integer life;

    private int x;
    private int y;

    public Inimigo(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.life = 100;
    }


    @Override
    public void update(Observable observable, Object o) {
        Personagem personagem = (Personagem) observable;
        if (((this.x - personagem.getX()) == 0) && ((this.y - personagem.getY()) == 0)) {
            personagem.dano(5);
            System.out.println("chegou " + nome);
        } else {
            if (personagem.getX() > this.x) this.x++;
            else if (personagem.getX() < this.x) this.x--;
            if (personagem.getY() > this.y) this.y++;
            else if (personagem.getY() < this.y) this.y--;
        }
    }

    public void updateAtaque(Personagem personagem) {
        if (personagem.getX() == this.getX() && personagem.getY() == this.getY()) {
            this.dano(50);
            if (this.getLife() <= 0) personagem.deletaInimigos(this);
        }
    }

    public void dano(int o) {
        this.life -= o;
    }

    //Getters && Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

}
