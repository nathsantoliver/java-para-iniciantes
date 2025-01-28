package cap09.lancando;

// Relança uma exceção.
class Rethrow {
    public static void genExcecption() {
        // aqui, numer é mais longo do que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(
                        numer[i] + " / " +
                                denom[i] + " is " +
                                numer[i]/denom[i]
                );
            } catch (ArithmeticException exc) {
                //captura a exceção
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                //captura a exceção
                System.out.println("No matching element found.");
                throw exc;  // relança a exceçoã
            }
        }
    }
}
