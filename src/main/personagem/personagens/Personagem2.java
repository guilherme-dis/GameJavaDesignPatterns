package main.personagem.personagens;


import main.personagem.personagens.classesimplement.AtacarMedio;
import main.personagem.personagens.classesimplement.CorrerRapido;
import main.personagem.personagens.classesimplement.PularAlto;

public class Personagem2 extends Personagem {
    public Personagem2(int x,int y){
        super(x,y);
        setAtacar(new AtacarMedio());
        setCorrer(new CorrerRapido());
        setPular(new PularAlto());
    }

}
