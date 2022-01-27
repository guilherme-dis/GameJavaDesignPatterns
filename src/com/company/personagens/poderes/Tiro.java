package com.company.personagens.poderes;

import com.company.personagens.personagens.Personagem;

public class Tiro extends PersonagemDecorador{
    public Tiro(Personagem personagem) {
        super(personagem,personagem.getNome(), personagem.getX(), personagem.getY());
//        setDano(35);
        setCusto(20);
    }
}
