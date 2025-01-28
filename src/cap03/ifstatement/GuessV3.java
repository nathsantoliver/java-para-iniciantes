package cap03.ifstatement;

import java.io.IOException;

// Adivinhe a letra do jogo, 3a versão
public class GuessV3 {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();  // lê um char no teclado

        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.println("...Sorry, you're wrong.");

            // um if aninhado
            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }

    }
}
