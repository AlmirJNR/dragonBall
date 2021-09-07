package dragonBall;

public class Terraqueo extends PersonagemDragonBall {
    String pais = "";
    String cidade = "";

    //<- Pais ->
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    //<- Cidade ->
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
}
