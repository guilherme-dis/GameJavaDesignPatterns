package com.company.personagens;

import com.company.personagens.comportamentos.comportamentosconcretos.CorridaDevagar;
import com.company.personagens.comportamentos.comportamentosconcretos.PuloAlto;
import com.company.personagens.comportamentos.comportamentosconcretos.PuloBaixo;
import com.company.personagens.inimigo.Inimigo;
import com.company.personagens.personagens.*;
import com.company.personagens.poderes.Raio;
import com.company.personagens.poderes.SuperChute;
import com.company.personagens.poderes.Tiro;

public class AdvancedPersonagemFactory extends Factory {

    public  Personagem createPersonagem(int x, int y) {
        double n = Math.random();
        Personagem p = null;
        if (n <= 0.2) {

            p = new Personagem1("Guerreiro", x, y);
            p.setAtacar(new Tiro(p.getAtacar()));
            p.setCorrer(new CorridaDevagar());

        } else if (0.2 < n && n <= 0.4) {
            p = new Personagem2("Mago", x, y);
            p.setAtacar(new Raio(p.getAtacar()));
            p.setAtacar(new Tiro(p.getAtacar()));
            p.setAtacar(new SuperChute(p.getAtacar()));
        } else if (0.4 < n && n <= 0.6) {

            p = new Personagem3("Arqueiro", x, y);
            p.setAtacar(new Tiro(p.getAtacar()));
            p.setAtacar(new SuperChute(p.getAtacar()));
            p.setCorrer(new CorridaDevagar());
        } else if (0.6 < n && n <= 0.8) {

            p = new Personagem4("Centauro", x, y);
            p.setAtacar(new Raio(p.getAtacar()));
            p.setAtacar(new Tiro(p.getAtacar()));
            p.setPular(new PuloBaixo());
        } else if (0.8 < n && n <= 1.0) {

            p = new Personagem5("Galatico", x, y);
            p.setCorrer(new CorridaDevagar());
            p.setPular(new PuloAlto());
            p.setAtacar(new Tiro(p.getAtacar()));
        }
        return p;
    }

    @Override
    public Inimigo createInimigo(int x, int y) {
        return null;
    }


}
