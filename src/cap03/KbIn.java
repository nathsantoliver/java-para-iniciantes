package cap03;

import java.io.IOException;

// Lê um caractere no teclado
public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.print("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // obtém um char (lê um caractere no teclado)

        System.out.println("Your key is: " + ch);
    }
}
