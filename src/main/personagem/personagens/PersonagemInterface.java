package main.personagem.personagens;

import main.personagem.inimigo.Observador;

public interface PersonagemInterface {

    public void addObserver(Observador o);
    public void removeObserver(Observador o);
    public void notifyObservers();
}
