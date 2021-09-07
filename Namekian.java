package dragonBall;

import java.io.PrintStream;

public class Namekian extends PersonagemDragonBall{
    private int quantidadeEsferas = 0;
    private boolean podeCurar;

    //<- QuantidadeEsferas ->
    public void setQuantidadeEsferas(int quantidadeEsferas) {
        this.quantidadeEsferas = quantidadeEsferas;
    }
    public int getQuantidadeEsferas() {
        return quantidadeEsferas;
    }

    //<- Pode Curar ->
    public void setPodeCurar(boolean podeCurar) {
        this.podeCurar = podeCurar;
    }

    //Irá retornar o pedido feito para as esferas do dragão
    protected static PrintStream transformarPedido(String pedido) {
        return System.out.printf("Pedido efetuado e traduzido com sucesso, seu entendimento da lingua é nula...%nVou facilitar e te devolver de maneira que possa entender: " + pedido);
    }

}
