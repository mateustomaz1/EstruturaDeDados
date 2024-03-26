package ListaDuplamenteEncadeadaCircular;

public class ListaDuplamenteEncadeadaCircular {
    private Node head;
    private int size;


    public ListaDuplamenteEncadeadaCircular() {
        head = null;
        size = 0;
    }

    public void adicionarNoInicio(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void adicionarNoFinal(int data) {
        if (head == null) {
            adicionarNoInicio(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            size++;
        }
    }

    public void adicionarPorPosicao(int data, int posicao) {
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            adicionarNoInicio(data);
        } else if (posicao == size) {
            adicionarNoFinal(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < posicao - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void remover(int data) {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            if (current.data == data) {
                if (size == 1) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) {
                        head = current.next;
                    }
                }
                size--;
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void imprimir() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
