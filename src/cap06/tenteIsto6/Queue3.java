package cap06.tenteIsto6;

// Tente Isto 6-2
public class Queue3 {
    private char q[];
    private int putloc, getloc;

    // Constrói uam fila vazia dado seu tamanho.
    Queue3(int size) {
        q = new char[size];    // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Construindo uma fila a partir de outra
    Queue3(Queue3 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copia elementos
        for (int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    // Constrói uma fila com valores iniciais.
    Queue3(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    // Insere um caractere na fila.
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Obtém um caractere na fila.
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue ins empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
