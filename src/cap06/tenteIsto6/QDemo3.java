package cap06.tenteIsto6;

// Tente Isto 6-2
public class QDemo3 {
    public static void main(String[] args) {
        // Constrói uma fila vazia para 10 elementos.
        Queue3 q1 = new Queue3(10);

        char name[] = { 'T', 'o', 'm' };
        // Constrói uma fila a partir do array.
        Queue3 q2 = new Queue3(name);

        char ch;
        int i;

        // Insere alguns caracteres em q1.
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Constrói uma fila a partir de outra.
        Queue3 q3 = new Queue3(q1);

        // Exibe as filas.
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
