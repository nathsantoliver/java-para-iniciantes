package cap02.conversao;

// Demonstra coerção
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);  // converte douuble em int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;  // Ocorrerá o truncamento nessa conversão (int)
        System.out.println("Value oof b: " + b);  // não há perda de informações aqui. Um byte pode conter o valor 100.

        i = 257;
        b = (byte) i;  // Desta vez há perda de informações. Um byte não pode conter o valor 257.

        b = 88;  // ASCII para X
        ch = (char) b;  // coerção entre tipos incompatíveis
        System.out.println("ch: " + ch);
    }
}