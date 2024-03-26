package ListaDuplamenteLigada;

public class ListaDuplamenteEncadeada {
    No cabeca, cauda;

    ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
    }

    void adicionarInicio(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    void adicionarFim(int dado) {
        No novoNo = new No(dado);
        if (cauda == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    void adicionarNaPosicao(int dado, int posicao) {
        if (posicao < 0)
            throw new IllegalArgumentException("A posição não pode ser negativa");

        if (posicao == 0) {
            adicionarInicio(dado);
            return;
        }

        No novoNo = new No(dado);
        No atual = cabeca;
        int indice = 0;

        while (atual != null && indice < posicao - 1) {
            atual = atual.proximo;
            indice++;
        }

        if (atual == null)
            throw new IllegalArgumentException("A posição está fora dos limites");

        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;
        if (atual.proximo != null)
            atual.proximo.anterior = novoNo;
        atual.proximo = novoNo;
    }

    void remover(int dado) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado == dado) {
                if (atual == cabeca) {
                    cabeca = cabeca.proximo;
                    if (cabeca != null)
                        cabeca.anterior = null;
                    if (cabeca == null)
                        cauda = null;
                } else if (atual == cauda) {
                    cauda = cauda.anterior;
                    cauda.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    void imprimirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
