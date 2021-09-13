package dragonBall;

public class app {
    public static void main(String[] args) {
        //Declarando novos objetos da classe PersonagemDragonBall
        Terraqueo kuririn = new Terraqueo();
        Sayajin goku = new Sayajin();
        Sayajin gohan = new Sayajin();
        Namekian dende = new Namekian();

        //Atribuindo valores de atributos para a instância do objeto da subclasse Terraqueo
        kuririn.setPais("");
        kuririn.setCidade("");
        //Atribuindo valores de atributos para a instância do objeto da superclasse PersonagemDragonBall
        kuririn.setNome("Kuririn");
        kuririn.setIdade(5);
        kuririn.setSexo('M');
        kuririn.setTemporada(5);
        kuririn.setKi(7);
        kuririn.setPoderEspecial("Morrer");

        //Atribuindo valores de atributos para a instância do objeto da subclasse Sayajin
        goku.setNivelMaximoSSJ(5);
        //=>goku.setTemRabo(true);
        //Atribuindo valores de atributos para a instância do objeto da superclasse PersonagemDragonBall
        goku.setNome("Goku");
        goku.setIdade(35);
        goku.setSexo('M');
        goku.setTemporada(0);
        goku.setKi(8001);
        goku.setPoderEspecial("Kamehameha");

        //Atribuindo valores de atributos para a instância do objeto da subclasse Sayajin
        gohan.setNivelMaximoSSJ(2);
        //=>gohan.setTemRabo(false);
        //Atribuindo valores de atributos para a instância do objeto da superclasse PersonagemDragonBall
        gohan.setNome("Gohan");
        gohan.setIdade(20);
        gohan.setSexo('M');
        gohan.setTemporada(2);
        gohan.setKi(3500);
        gohan.setPoderEspecial("Kameham");

        //Atribuindo valores de atributos para a instância do objeto da subclasse Namekian
        dende.setQuantidadeEsferas(7);
        //=>dende.setPodeCurar(true);
        //Atribuindo valores de atributos para a instância do objeto da superclasse PersonagemDragonBall
        dende.setNome("Dendê");
        dende.setIdade(600);
        dende.setSexo('M');
        dende.setTemporada(0);
        dende.setKi(9999);
        dende.setPoderEspecial("Curar");

        //Passando os objetos como parâmetros no método transformar da classe Sayajin
        Sayajin.transformar(goku, 5);
        Sayajin.transformar(gohan, 5);

        //Passando os string como parâmetros no método transformarPedido da classe Namekian
        System.out.println(Namekian.transformarPedido("Reviver o Kuririn"));  
    }
}
