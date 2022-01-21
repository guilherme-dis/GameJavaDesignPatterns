package main.personagem.personagens;


import main.personagem.personagens.atributos.tipos.AtacarForte;
import main.personagem.personagens.atributos.tipos.CorrerRapido;
import main.personagem.personagens.atributos.tipos.PularBaixo;

public class Personagem3 extends Personagem {
    public Personagem3(int x,int y){
        super(x,y);
        setPular(new PularBaixo());
        setCorrer(new CorrerRapido());
        setAtacar(new AtacarForte());
    }
}
