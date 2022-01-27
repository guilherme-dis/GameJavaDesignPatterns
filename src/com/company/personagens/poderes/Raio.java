package com.company.personagens.poderes;

import com.company.personagens.personagens.Personagem;
import com.company.personagens.poderes.PersonagemDecorador;

public class Raio extends PersonagemDecorador {
    public Raio(Personagem personagem) {
        super(personagem,personagem.getNome(), personagem.getX(), personagem.getY());
//        setDano(50);
        setCusto(5);
    }
}
