package cap05.bitwise;

// Letras minúsculas.
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Essa instrução ativa o 6o bit.
            ch = (char) ((int) ch | 32);    // agora ch é minúscula

            System.out.println(ch + " ");
        }
    }
}
