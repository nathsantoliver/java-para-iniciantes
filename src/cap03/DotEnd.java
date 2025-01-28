package cap03;

import java.io.IOException;

// Ler caracteres até um ponto ser recebido
public class DotEnd {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
