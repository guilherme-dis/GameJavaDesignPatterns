package com.company.personagens.poderes;

import com.company.personagens.personagens.Personagem;

public class SuperChute extends PersonagemDecorador {
    public SuperChute(Personagem personagem) {
        super(personagem,personagem.getNome(), personagem.getX(), personagem.getY());
//        setDano(20);
        setCusto(15);
    }
}
