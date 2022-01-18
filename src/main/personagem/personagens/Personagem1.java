package main.personagem.personagens;


import main.personagem.personagens.classesimplement.AtacarForte;
import main.personagem.personagens.classesimplement.CorrerMedio;
import main.personagem.personagens.classesimplement.PularMedio;

public class Personagem1 extends Personagem {
    public Personagem1(int x,int y){
        super(x,y);
        setAtacar(new AtacarForte());
        setPular(new PularMedio());
        setCorrer(new CorrerMedio());
    }

}
