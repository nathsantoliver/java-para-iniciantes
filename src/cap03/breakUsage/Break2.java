package cap03.breakUsage;

import java.io.IOException;

// Lê a entrada até um q ser recebido.
public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read(); // obtém um char
            if (ch == 'q') break;
        }
        System.out.println("You pressed \'q\'");
    }
}
