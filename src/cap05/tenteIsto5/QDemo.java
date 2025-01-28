package cap05.tenteIsto5;

// Demonstra a classe Queue
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // insere alguns números em bigQ
        for (i=0;i<26;i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Agora, usa smallQ para gerar alguns erros
        for (i=0;i<5;i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // mains erros em smallQ
        System.out.println("Contents of smallQ: ");
        for (i=0;i<5;i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.println(ch);
        }
    }
}
