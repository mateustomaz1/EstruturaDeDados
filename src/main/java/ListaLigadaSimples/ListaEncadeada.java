package ListaLigadaSimples;

public class ListaEncadeada<T> {
    private Nodo <T> inicio;
    private Nodo <T> ultimo;
    private int size = 0;

    private final int NAO_ENCONTRADO = - 1;

    public void adicionar (T elemento){
        Nodo <T> celula = new Nodo <T>(elemento);
        if (this.size == 0){
            this.inicio = celula;
        }else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.size ++;
    }


    public void limpa(){
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void adicionarInicio(T elemento){
        if (this.size == 0){
        Nodo <T> novoNodo = new Nodo<>(elemento);
        this.inicio = novoNodo;
        this.ultimo = novoNodo;
        }else{
            Nodo <T> novoNodo = new Nodo<>(elemento,this.inicio);
            this.inicio = novoNodo;
        }
        this.size++;
    }

    public void adicionar(int posicao, T elemento){
        if (posicao < 0 || posicao > this.size){
            throw new IllegalArgumentException("Posição inválida");
        }
        if (this.size == 0){ // está vazia
            this.adicionar(elemento);
        }else if (posicao == this.size){ //adiciona
            this.adicionar(elemento);
        }else{ //meio
            Nodo <T> nodoAnterior = this.buscaNodo(posicao);
            Nodo <T> proximoNodo =  nodoAnterior.getProximo();
            Nodo <T> novoNodo = new Nodo<>(elemento,proximoNodo);
            nodoAnterior.setProximo(novoNodo);
            this.size++;
        }
    }

    private Nodo <T> buscaNodo (int posicao){


        if (!(posicao > 0 && posicao <= this.size)){
            throw new IllegalArgumentException("Posição não existe.");
        }
        Nodo <T> nodoAtual = this.inicio;
        for (int i = 0; i < posicao; i++){
            nodoAtual =nodoAtual.getProximo();
        }
        return nodoAtual;
    }

    public T buscaPorPosicao(int posicao){
        return this.buscaNodo(posicao).getElemento();
    }

    public int busca(T elemento){

        Nodo <T> nodoAtual = this.inicio;
        int pos = 0;
        while (nodoAtual != null){
            if (nodoAtual.getElemento().equals(elemento)){
                return pos;
            }
            pos++;
            nodoAtual = nodoAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        if(this.size == 0){
            return "[ ]";
        }

        StringBuilder builder = new StringBuilder("[");

        Nodo<T> atual = this.inicio;
        for ( int i = 0; i < this.size - 1; i++){
            builder.append(atual.getElemento()).append(",");
            atual =atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();

    }
}
