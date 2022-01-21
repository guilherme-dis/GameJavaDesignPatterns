package main.personagem.inimigo;

import main.personagem.personagens.Personagem;

public class Inimigo implements Observador {

    private String nome;
    private Integer life;

    private int x;
    private int y;
    private final Personagem personagem;


    public Inimigo(Personagem personagem, String nome, int x, int y) {
        this.personagem = personagem;
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.life = 100;
        this.personagem.adicionarObservador(this);
    }


    @Override
    public void update() {
        if (((this.x - this.personagem.getX()) == 0) && ((this.y - this.personagem.getY()) == 0)) {
            this.personagem.dano(5);
            System.out.println("chegou " + nome);
        } else {
            if (this.personagem.getX() > this.x) this.x++;
            else if (this.personagem.getX() < this.x) this.x--;
            if (this.personagem.getY() > this.y) this.y++;
            else if (this.personagem.getY() < this.y) this.y--;
        }
    }

    @Override
    public void updateAtaque(Personagem personagem) {
        if (personagem.getX() == this.getX() && personagem.getY() == this.getY()) {
            this.dano(50);
            if (this.getLife() <= 0) {
                personagem.removerObservador(this);
            }
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
