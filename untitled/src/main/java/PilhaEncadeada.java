public class PilhaEncadeada<T> {
    No<T> top;

    PilhaEncadeada(){
    }

    public void push(T valor) {
        No<T> noAdicionar = new No<>();
        noAdicionar.valor = valor;

        if(top == null) {
            top = noAdicionar;
            return;
        }

        noAdicionar.proximo = top;
        top = noAdicionar;
    }

    public void pop(){
        if (top == null) {
            throw new NullPointerException("Não existe nada na pilha");
        }

        No<T> noRemover = top;
        top = top.proximo;
        noRemover = null;
    }

    public void imprimirPilha() {
        No<T> noAtual = top;
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
