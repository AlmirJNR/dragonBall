package dragonBall;

public class Namekian extends PersonagemDragonBall {
    private int quantidadeEsferas = 0;
    //=>private boolean podeCurar;

    //Construtor Completo
    Namekian(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int quantidadeEsferas) {//, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        //this.podeCurar = podeCurar;
    }

    //<- QuantidadeEsferas ->
    public void setQuantidadeEsferas(int quantidadeEsferas) {
        this.quantidadeEsferas = quantidadeEsferas;
    }
    public int getQuantidadeEsferas() {
        return quantidadeEsferas;
    }

    //<- Pode Curar ->
    //=>public void setPodeCurar(boolean podeCurar) {
    //=>    this.podeCurar = podeCurar;
    //=>}

    //Irá retornar o pedido feito para as esferas do dragão
    protected static String transformarPedido(String pedido) {
        String pedidoTraduzido = "";

        for (int i = 0; i < pedido.length(); i++) {
            switch (pedido.charAt(i)) {
                case 'a':
                    pedidoTraduzido += 'z';
                    break;

                case 'e':
                    pedidoTraduzido += 'y';
                    break;

                case 'i':
                    pedidoTraduzido += 'x';
                    break;

                case 'o':
                    pedidoTraduzido += 'w';
                    break;

                case 'u':
                    pedidoTraduzido += 'v';
                    break;
                
                default:
                    pedidoTraduzido += pedido.charAt(i);
                    break;
            }
        }
        return pedidoTraduzido;
    }

}
