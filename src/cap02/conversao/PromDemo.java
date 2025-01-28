package cap02.conversao;

// o inesperado em uma promoção!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // Certo, não é necessária uma coerção porque o resultado já é elevado a int

        i = 10;
        b = (byte) (b * b);  // Coerção necessária!!

        System.out.println("i and b: " + i + " " + b);
    }
}
