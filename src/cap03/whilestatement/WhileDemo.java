package cap03.whilestatement;

// Demonstra o laço while.
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // exibe o alfabeto usando um laço while
        ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}
