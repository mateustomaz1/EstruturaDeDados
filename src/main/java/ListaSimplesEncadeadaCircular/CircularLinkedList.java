package ListaSimplesEncadeadaCircular;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public boolean estáVazia() {
        return head == null;
    }

    public void adicionarNoInício(int data) {
        Node novoNó = new Node(data);
        if (estáVazia()) {
            novoNó.next = novoNó;
            head = novoNó;
        } else {
            Node último = head;
            while (último.next != head) {
                último = último.next;
            }
            novoNó.next = head;
            head = novoNó;
            último.next = novoNó;
        }
    }

    public void adicionarNoFinal(int data) {
        Node novoNó = new Node(data);
        if (estáVazia()) {
            novoNó.next = novoNó;
            head = novoNó;
        } else {
            Node último = head;
            while (último.next != head) {
                último = último.next;
            }
            último.next = novoNó;
            novoNó.next = head;
        }
    }

    public void adicionarNaPosição(int data, int posição) {
        if (posição < 0)
            throw new IllegalArgumentException("Posição inválida");

        if (posição == 0) {
            adicionarNoInício(data);
            return;
        }

        Node novoNó = new Node(data);
        Node temp = head;
        for (int i = 0; i < posição - 1; i++) {
            if (temp.next == head)
                throw new IndexOutOfBoundsException("Posição fora dos limites");
            temp = temp.next;
        }
        novoNó.next = temp.next;
        temp.next = novoNó;
    }

    public void remover(int data) {
        if (estáVazia())
            return;

        Node atual = head;
        Node anterior = null;

        if (atual.data == data) {
            while (atual.next != head) {
                atual = atual.next;
            }
            head = head.next;
            atual.next = head;
            return;
        }

        while (atual.next != head && atual.data != data) {
            anterior = atual;
            atual = atual.next;
        }

        if (atual.data == data) {
            anterior.next = atual.next;
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }

    public void exibir() {
        if (estáVazia()) {
            System.out.println("Lista vazia.");
            return;
        }
        Node atual = head;
        do {
            System.out.print(atual.data + " ");
            atual = atual.next;
        } while (atual != head);
        System.out.println();
    }
}
