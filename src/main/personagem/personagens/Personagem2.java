package main.personagem.personagens;


import main.personagem.personagens.atributos.tipos.AtacarMedio;
import main.personagem.personagens.atributos.tipos.CorrerRapido;
import main.personagem.personagens.atributos.tipos.PularAlto;

public class Personagem2 extends Personagem {
    public Personagem2(int x,int y){
        super(x,y);
        setAtacar(new AtacarMedio());
        setCorrer(new CorrerRapido());
        setPular(new PularAlto());
    }

}
