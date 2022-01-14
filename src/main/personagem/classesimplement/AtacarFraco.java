package main.personagem.classesimplement;

import main.personagem.interfaces.Atacar;

public class AtacarFraco implements Atacar {
    public void atacar(){
        System.out.println("Ataque fraco");
    }
}
