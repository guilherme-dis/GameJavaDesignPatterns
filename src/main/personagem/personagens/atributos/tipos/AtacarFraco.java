package main.personagem.personagens.atributos.tipos;

import main.personagem.personagens.atributos.Atacar;

public class AtacarFraco implements Atacar {
    public int atacar(){
        System.out.println("Ataque fraco");
        return 1;
    }
}
