package com.company.personagens;

import com.company.personagens.inimigo.Inimigo;
import com.company.personagens.inimigo.Inimigo1;
import com.company.personagens.inimigo.Inimigo2;
import com.company.personagens.inimigo.Inimigo3;
import com.company.personagens.personagens.Personagem;

public class SimplePersonagemFactoryInimigo extends Factory {
    @Override
    public Personagem createPersonagem(int x, int y) {
        return null;
    }

    public Inimigo createInimigo(int x, int y) {
        double n = Math.random();
        Inimigo p = null;
        if (n <= 0.2) {

            p = new Inimigo1("Dudu", x, y);

        } else if (0.2 < n && n <= 0.4) {
            p = new Inimigo2("taga", x, y);
        } else if (0.4 < n && n <= 0.6) {

            p = new Inimigo3("guigui", x, y);
        }
        return p;
    }
}
