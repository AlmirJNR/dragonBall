package dragonBall;

public class PersonagemDragonBall {
    String nome = "";
    int idade = 0;
    char sexo = 0;
    int temporada = 0;
    int ki = 0;
    String poderEspecial = "";

    //<- Nome ->
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //<- Idade ->
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    //<- Sexo ->
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return sexo;
    }

    //<- Temporada ->
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public int getTemporada() {
        return temporada;
    }

    //<- Ki ->
    public void setKi(int ki) {
        this.ki = ki;
    }
    public int getKi() {
        return ki;
    }

    //<- Poder Especial ->
    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }
    public String getPoderEspecial() {
        return poderEspecial;
    }
}

