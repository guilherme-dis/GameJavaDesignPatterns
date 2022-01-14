package main.state;

import main.personagem.classesimplement.Atacar_0;
import main.personagem.classesimplement.Correr_0;
import main.personagem.classesimplement.Pular_0;
import main.personagem.personagens.Personagem;

public class Morto extends State {
    public Morto(Personagem context) {
        super(context);
        getPersonagem().setAtacar(new Atacar_0());
        getPersonagem().setPular(new Pular_0());
        getPersonagem().setCorrer(new Correr_0());
        System.out.println("morreu");
        System.exit(0);
    }

    @Override
    protected void setLimites() {

    }

    @Override
    protected void verificarAlteracaoEstado() {

    }
    //ai acaba ne meu patrão
}
