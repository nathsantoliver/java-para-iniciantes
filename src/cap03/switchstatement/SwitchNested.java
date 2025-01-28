package cap03.switchstatement;

import java.io.IOException;

public class SwitchNested {
    public static void main(String[] args) throws IOException {
        char ch1, ch2;

        ch1 = (char) System.in.read();

        switch (ch1) {
            case 'A':
                System.out.println("This A is part of outer switch.");
                ch2 = (char) System.in.read();
                switch (ch2) {
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B': // ...
                } // fim do switch interno
                break;
            case 'B': // ...
        }
    }
}
