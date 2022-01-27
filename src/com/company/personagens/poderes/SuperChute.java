package com.company.personagens.poderes;

import com.company.personagens.comportamentos.Atacar;

public class SuperChute extends AtaqueDecorador {

    public SuperChute(Atacar atacarDecorado) {
        super(atacarDecorado);
        setDano(15);
    }
}
