package dragonBall;

import java.io.PrintStream;

public class Sayajin extends PersonagemDragonBall {
    private int nivelMaximoSSJ = 0;
    //=>private boolean temRabo;

    //Construtor Completo
    Sayajin(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int nivelMaximoSSJ) {//, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        //this.temRabo = temRabo;
    }

    //<- Nivel Maximo SSJ ->
    public void setNivelMaximoSSJ(int nivelMaximoSSJ) {
        this.nivelMaximoSSJ = nivelMaximoSSJ;
    }
    public int getNivelMaximoSSJ() {
        return nivelMaximoSSJ;
    }

    //<- Tem Rabo ->
    //=>public void setTemRabo(boolean temRabo) {
    //=>    this.temRabo = temRabo;
    //=>}

    //Irá retornar se o Sayajin poderá ou não se transformar
    protected static PrintStream transformar(PersonagemDragonBall personagem, int nivelSaiyajin) {
        if (personagem.getNome().equals("Goku") || personagem.getNome().equals("Vegeta") && (nivelSaiyajin == 4 || nivelSaiyajin == 5)) {
            return System.out.printf("%s transformou para super saiyajin nível %d%n", personagem.getNome(), nivelSaiyajin);
        }
        else if (personagem.getClass() == Sayajin.class && nivelSaiyajin <= 3) {
            return System.out.printf("%s transformou para super saiyajin nível %d%n", personagem.getNome(), nivelSaiyajin);
        }
        else {
            return System.out.printf("%s não pôde transformar para super saiyajin nível %d%n", personagem.getNome(), nivelSaiyajin);
        }
    }
}
