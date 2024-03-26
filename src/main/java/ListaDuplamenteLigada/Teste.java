package ListaDuplamenteLigada;

public class Teste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.adicionarInicio(3);
        lista.adicionarInicio(1);
        lista.adicionarFim(5);
        lista.adicionarFim(7);
        lista.adicionarNaPosicao(4, 2);

        System.out.print("Lista atual: ");
        lista.imprimirLista();

        lista.remover(5);

        System.out.print("Lista após remover 5: ");
        lista.imprimirLista();
    }
}
