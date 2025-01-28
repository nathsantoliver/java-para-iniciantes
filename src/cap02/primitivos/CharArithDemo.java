package cap02.primitivos;

// Variáveis de caracteres podem ser tratadas como inteiros.
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;  // increments ch (um char pode ser incrementado)
        System.out.println("ch is now " + ch);

        ch = 90;   // dá a ch o valor Z (um char pode receber um valor inteiro)
        System.out.println("ch is now " + ch);
    }
}
