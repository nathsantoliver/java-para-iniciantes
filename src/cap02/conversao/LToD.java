package cap02.conversao;

// Demonstra a conversão automática de long para double
public class LToD {
    public static void main(String[] args) {
        long l;
        double d;

        l = 100123285L;
        d = l;

        System.out.println("L and D: " + l + " " + d);

        // double não converte para long
    }
}
