package main.personagem.personagens;


import main.personagem.classesimplement.AtacarForte;
import main.personagem.classesimplement.CorrerRapido;
import main.personagem.classesimplement.PularBaixo;

public class Personagem3 extends Personagem {
    public Personagem3(int x,int y){
        super(x,y);
        setPular(new PularBaixo());
        setCorrer(new CorrerRapido());
        setAtacar(new AtacarForte());
    }

}
