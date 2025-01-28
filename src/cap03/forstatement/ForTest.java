package cap03.forstatement;

import java.io.IOException;

// Executa o laço até um S ser digitado.
public class ForTest {
    public static void main(String[] args) throws IOException {
        int i;

        System.out.println("Press S to stop.");

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
