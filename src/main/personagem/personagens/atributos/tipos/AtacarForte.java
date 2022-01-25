package main.personagem.personagens.atributos.tipos;

import main.personagem.personagens.atributos.Atacar;

public class AtacarForte implements Atacar {
    public int atacar(){
        System.out.println("Ataque forte");
        return 5;
    }
}
