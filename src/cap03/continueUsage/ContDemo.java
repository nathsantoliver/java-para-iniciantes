package cap03.continueUsage;

// Usa continuue
public class ContDemo {
    public static void main(String[] args) {
        int i;

        // exibe os nmúeros pares entre 0 e 100
        for (i=0; i<=100; i++) {
            if ((i%2) != 0) continue;   // iterate
            System.out.println(i);
        }
    }
}
