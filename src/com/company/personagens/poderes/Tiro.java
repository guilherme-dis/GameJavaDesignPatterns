package com.company.personagens.poderes;

import com.company.personagens.comportamentos.Atacar;

public class Tiro extends AtaqueDecorador {

    public Tiro(Atacar atacarDecorado) {
        super(atacarDecorado);
        setDano(11);
    }
}
