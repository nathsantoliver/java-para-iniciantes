package cap09.subclasses;

// Subclasses devem preceder as superclasses em instruções catch.
class ExcDemo5 {
    public static void main(String[] args) {
        // Aqui, numer é mais longo do que denom.
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(
                        numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]
                );
            } catch (ArrayIndexOutOfBoundsException exc) {  // Captura a subclasse
                //captura a exceção
                System.out.println("No matching element found.");
            } catch (Throwable exc) {   // Captura a supercclasse
                System.out.println("Some exception occurred.");
            }
        }
    }
}
