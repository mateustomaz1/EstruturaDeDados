package ListaLigadaSimples;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {

        // adicionaInicio();
        adicionaPosicao();

    }

    public static void adicionaInicio(){
        ListaEncadeada <Integer> lista = new ListaEncadeada<>();

        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1); //1, 2, 3

        System.out.println(lista);

    }

    public static void adicionaPosicao() {
        ListaEncadeada <Integer> lista = new ListaEncadeada<>();
        // lista.adicionar(-1,1);
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(4);

        lista.adicionar(0,0);
        lista.adicionar(4,5);
        lista.adicionar(3,3);

        System.out.println(lista);
    }

    public static void testesIniciais(String[] args) {
        ListaEncadeada <Integer> lista = new ListaEncadeada ();
        lista.adicionar(1);
        System.out.println("Tamanho = " + lista.getSize());
        System.out.println(lista);

        lista.adicionar(2);
        System.out.println(lista);
        lista.adicionar(3);
        System.out.println(lista);

//        lista.limpa();
//        System.out.println(lista);

        System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(3));
        System.out.println(lista.buscaPorPosicao(-4));
    }
}
