package main.personagem.inimigo;

import main.personagem.personagens.Sujeito;

public interface Observador {
    //public void update();
    public void update(Sujeito sujeito);
    public void updateAtaque(Sujeito sujeito);
}
