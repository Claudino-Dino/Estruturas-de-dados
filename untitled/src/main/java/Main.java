public class Main {

    public static void main(String[] args) {

        // LISTA ENCADEADA

        ListaEncadeada l = new ListaEncadeada();

        System.out.println("LISTA");

        l.queue("primeiro");
        l.queue("segundo");
        l.queue("terceiro");

        l.imprimirLista();

        System.out.println();

        l.dequeue();

        l.imprimirLista();

        System.out.println();

        // PILHA ENCADEADA

        PilhaEncadeada p = new PilhaEncadeada<>();

        System.out.println("PILHA");

        p.push("a");
        p.push("b");
        p.push("c");

        p.imprimirPilha();

        System.out.println();
        p.pop();

        p.imprimirPilha();
    }

}
