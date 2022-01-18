package main.personagem.personagens.classesimplement;

import main.personagem.personagens.interfaces.Atacar;

public class AtacarFraco implements Atacar {
    public void atacar(){
        System.out.println("Ataque fraco");
    }
}
