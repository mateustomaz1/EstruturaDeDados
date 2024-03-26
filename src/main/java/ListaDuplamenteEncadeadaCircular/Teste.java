package ListaDuplamenteEncadeadaCircular;

public class Teste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeadaCircular lista = new ListaDuplamenteEncadeadaCircular();

        lista.adicionarNoInicio(1);
        lista.adicionarNoFinal(3);
        lista.adicionarNoInicio(0);
        lista.adicionarPorPosicao(2, 2);
        lista.imprimir(); // Deve imprimir: 0 1 2 3

        lista.remover(2);
        lista.imprimir(); // Deve imprimir: 0 1 3
    }
}
