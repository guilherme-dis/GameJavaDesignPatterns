package main.personagem.personagens;

import main.personagem.inimigo.InimigoC;

public interface PersonagemObserver {
    public void adicionarObservador(InimigoC i);
    public void removerObservador(InimigoC i);
}
