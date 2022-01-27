package com.company.personagens.poderes;

import com.company.personagens.comportamentos.Atacar;

public abstract class AtaqueDecorador extends Atacar {
    private final Atacar atacarDecorado;


    public AtaqueDecorador(Atacar atacarDecorado) {
        this.atacarDecorado = atacarDecorado;
    }

    public int getDano(){
        return atacarDecorado.getDano()+super.getDano();
    }

}
