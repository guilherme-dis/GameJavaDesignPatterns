package main.personagem.personagens;

import main.personagem.inimigo.Inimigo;

public interface PersonagemObserver {
    public void adicionarObservador(Inimigo i);
    public void removerObservador(Inimigo i);
}
