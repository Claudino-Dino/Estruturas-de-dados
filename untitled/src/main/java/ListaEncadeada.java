public class ListaEncadeada<T> {
    No<T> head, tail;

    public void queue(T valor) {
        No<T> novoNo = new No<>();
        novoNo.valor = valor;

        if (head == null) {
            head = novoNo;
            tail = novoNo;
            return;
        }

        novoNo.valor = valor;
        tail.proximo = novoNo;
        tail = novoNo;
    }

    public void dequeue(){
        if (head == null) {
            throw new NullPointerException("Não existe nada na lista");
        }

        No<T> noRemover = head;
        head = head.proximo;
        noRemover.proximo = null;
    }

    public void imprimirLista() {
        No<T> noAtual = head;
        int i = 1;
        while (noAtual != null) {
            System.out.print(i);
            System.out.print(" - [");
            System.out.print(noAtual.valor);
            System.out.print("]");
            System.out.println();
            i++;
            noAtual = noAtual.proximo;
        }
    }

}
