package cap09.lancando;

// Lança manualmente uma exceção.
class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();    // Lança uma exceção
        } catch (ArithmeticException exc) {
            // captura a exceção
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
