package com.company;

import com.company.personagens.Factory;
import com.company.personagens.SimplePersonagemFactory;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Factory g = new SimplePersonagemFactory();
        g.jogar(g);


//        Factory g2 = new AdvancedPersonagemFactory();
//        g2.jogar(g2);
    }
}
