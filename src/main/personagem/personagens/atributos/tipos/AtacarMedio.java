package main.personagem.personagens.atributos.tipos;

import main.personagem.personagens.atributos.Atacar;

public class AtacarMedio implements Atacar {
    public int atacar(){
        System.out.println("Ataque medio");
        return 3;
    }
}
