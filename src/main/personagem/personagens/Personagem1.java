package main.personagem.personagens;


import main.personagem.personagens.atributos.tipos.AtacarForte;
import main.personagem.personagens.atributos.tipos.CorrerMedio;
import main.personagem.personagens.atributos.tipos.PularMedio;

public class Personagem1 extends Personagem {
    public Personagem1(int x,int y){
        super(x,y);
        setAtacar(new AtacarForte());
        setPular(new PularMedio());
        setCorrer(new CorrerMedio());
    }

}
