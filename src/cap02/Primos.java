package cap02;

public class Primos {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            // vê se o número tem divisoã exata
            for (j = 2; j <= i/2; j++) {
                // se tiver, não é primo
                if (i % j == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println(i + " is prime.");
            }
        }
    }
}
