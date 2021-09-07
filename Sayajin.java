package dragonBall;

public class Sayajin extends PersonagemDragonBall {
    private int nivelMaximoSSJ = 0;
    private boolean temRabo;

    //<- Nivel Maximo SSJ ->
    public void setNivelMaximoSSJ(int nivelMaximoSSJ) {
        this.nivelMaximoSSJ = nivelMaximoSSJ;
    }
    public int getNivelMaximoSSJ() {
        return nivelMaximoSSJ;
    }

    //<- Tem Rabo ->
    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
    }

    //Irá retornar se o Sayajin poderá ou não se transformar
    protected static boolean transformar(Sayajin personagem, int nivelSaiyajin) {
        if (personagem.getNome().equals("Goku") || personagem.getNome().equals("Vegeta") && (nivelSaiyajin == 4 || nivelSaiyajin == 5)) {
            System.out.printf("%s transformou para super saiyajin nível %d%n", personagem.getNome(), nivelSaiyajin);
            return true;
        }
        else if (personagem.getClass() == Sayajin.class && nivelSaiyajin <= 3) {
            System.out.printf("%s transformou para super saiyajin nível %d%n", personagem.getNome(), nivelSaiyajin);
            return true;
        }
        else {
            System.out.printf("Não foi possível transformar esse Sayajin%n");
            return false;
        }
    }
}
