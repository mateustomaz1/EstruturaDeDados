package ListaSimplesEncadeadaCircular;

public class Teste {
    public static void main(String[] args) {
        CircularLinkedList lista = new CircularLinkedList();

        lista.adicionarNoFinal(10);
        lista.adicionarNoFinal(20);
        lista.adicionarNoFinal(30);
        lista.adicionarNoFinal(40);
        lista.adicionarNoFinal(50);

        System.out.println("Lista inicial:");
        lista.exibir(); // Saída: 10 20 30 40 50

        lista.adicionarNoInício(5);
        System.out.println("Lista após adicionar no início:");
        lista.exibir(); // Saída: 5 10 20 30 40 50

        lista.adicionarNaPosição(15, 2);
        System.out.println("Lista após adicionar na posição 2:");
        lista.exibir(); // Saída: 5 10 15 20 30 40 50

        lista.remover(30);
        System.out.println("Lista após remover o elemento 30:");
        lista.exibir(); // Saída: 5 10 15 20 40 50
    }
}
