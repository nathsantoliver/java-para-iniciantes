package cap04.tenteIsto4;

import cap03.tenteIsto3.Help;

import java.io.IOException;

/*
    Tente Isto 4-1

    Converte o sistema de ajuda da seção Tente Isto 3-3 em uma classe Help.
 */

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        Help4 hlpobj = new Help4();

        for ( ; ; ) {

            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn(choice);

        }
    }
}
