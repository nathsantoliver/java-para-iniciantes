package cap06.tenteIsto6;

// Tente Isto 6-1
public class Queue2 {
    private char q[];   // esse array contém a fila
    private int putloc, getloc;    // os índices put e get

    Queue2(int size) {
        q = new char[size];    // aloca memória para a fila
        putloc = getloc = 0;
    }

    // insere um caractere na fila
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // obtém um caractere na fila
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue ins empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
