package dragonBall;

public class Terraqueo extends PersonagemDragonBall {
    private String pais = "";
    private String cidade = "";

    //Construtor Completo
    Terraqueo(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.pais = pais;
        this.cidade = cidade;
    }

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
