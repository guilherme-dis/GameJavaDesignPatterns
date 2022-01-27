package com.company.personagens.poderes;

import com.company.personagens.comportamentos.Atacar;

public class Raio extends AtaqueDecorador {

    public Raio(Atacar atacarDecorado) {
        super(atacarDecorado);
        setDano(20);
    }
}
