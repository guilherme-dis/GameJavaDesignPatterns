package main.personagem.inimigo;

import main.personagem.personagens.Personagem;
import main.personagem.personagens.PersonagemObserver;

public class InimigoConcreto implements Inimigo{
    private Personagem personagem;
    private String nome;

    private int x;
    private int y;


    public InimigoConcreto(Personagem p,String nome,int x,int y) {
        this.personagem = p;
        this.personagem.adicionarObservador(this);
        this.nome=nome;
        this.x=x;
        this.y=y;
    }

    public void atualizar(PersonagemObserver s) {
        Personagem personagem= (Personagem) s;
        if(((this.x- personagem.getX())==0)&&((this.y- personagem.getY())==0)){
            personagem.dano(5);
            System.out.println("chegou "+nome);
        }else{
            if(personagem.getX()>this.x)this.x=this.x+1;
            else this.x=this.x-1;

            if (personagem.getY() > this.y) this.y = this.y+1;
            else this.y = this.y-1;
            System.out.println(nome+" {"+x+","+y+"}");
        }
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
}
