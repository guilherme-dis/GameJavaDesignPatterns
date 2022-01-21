package main.personagem.inimigo;

import main.personagem.personagens.Personagem;

public interface Observador {
    public void update();
    //public void update(PersonagemInterface personagemInterface);
    public void updateAtaque(Personagem personagem);
}
