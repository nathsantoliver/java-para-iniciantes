package cap06;

// Demonstra a classe Stack.
public class SDemo {
    public static void main(String[] args) {
        // constrói uma pilha vazia de 10 elementos
        Stack stk1 = new Stack(10);

        char name[] = { 'T', 'o', 'm' };

        // constrói a pilha a partir do array
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        // insere alguns caracteres em stk1
        for (i = 0; i < 10; i++) {
            stk1.push((char) ('A' + i));
        }

        // constrói uma pilha a partir de outra pilha
        Stack stk3 = new Stack(stk1);

        // exibe as pilhas.
        System.out.print("Contents of stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
