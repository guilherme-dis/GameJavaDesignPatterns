package com.company.personagens.inimigo;

import com.company.personagens.personagens.Sujeito;

public interface Observador {
    public void update(Sujeito sujeito);
    public void updateAtaque(Sujeito sujeito);
}
