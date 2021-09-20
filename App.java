package dragonBall;

public class App {
    public static void main(String[] args) {
        // Declarando novos objetos da classe PersonagemDragonBall

        // -> Construtor de Terraqueo = (String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, String pais, String cidade)
        // -> Construtor de Sayajin = (String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int nivelMaximoSSJ)
        // -> Construtor de Namekian = (String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int quantidadeEsferas)

        //PersonagemDragonBall kuririn = new Terraqueo("Kuririn", 15, 'M', 5, 25, "Morrer", "Brasil", "Belo Horizonte");
        PersonagemDragonBall goku = new Sayajin("Goku", 35, 'M', 0, 8001, "Kamehameha", 5);
        PersonagemDragonBall gohan = new Sayajin("Gohan", 20, 'M', 2, 3500, "Kameham", 3);
        //PersonagemDragonBall dende = new Namekian("Dendê", 600, 'M', 0, 9999, "Curar", 7);

        // Passando os objetos como parâmetros no método transformar da classe Sayajin
        Sayajin.transformar(goku, 5);
        Sayajin.transformar(gohan, 5);

        // Passando os string como parâmetros no método transformarPedido da classe Namekian
        System.out.println("Seu pedido em Namekusei: " + Namekian.transformarPedido("Reviver o Kuririn"));
    }
}
