package main.personagem.personagens;


import main.personagem.classesimplement.AtacarForte;
import main.personagem.classesimplement.CorrerMedio;
import main.personagem.classesimplement.PularMedio;

public class Personagem1 extends Personagem {
    public Personagem1(int x,int y){
        super(x,y);
        setAtacar(new AtacarForte());
        setPular(new PularMedio());
        setCorrer(new CorrerMedio());
    }

}
