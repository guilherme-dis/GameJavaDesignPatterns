package com.company.personagens.poderes;

import com.company.personagens.personagens.Personagem;

public class PersonagemDecorador extends Personagem {
    private Personagem personagem;

    public PersonagemDecorador(Personagem personagem,String nome, int x, int y) {
        super(nome,x, y);
        this.personagem = personagem;
    }
    public int getCusto(){
        return personagem.getCusto()+super.getCusto();
    }
//    public int getDano() {
//        return personagem.getDano() + super.getDano();
//    }
}
