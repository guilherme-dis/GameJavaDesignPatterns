package com.company.personagens.personagens;


import com.company.personagens.inimigo.Observador;

public interface Sujeito {

    public void addObserver(Observador o);
    public void removeObserver(Observador o);
    public void notifyObservers();
}
