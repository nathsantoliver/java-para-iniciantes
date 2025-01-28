package cap09.lancando;

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genExcecption();
        } catch (ArrayIndexOutOfBoundsException exc) {  // Captura a exceção relançada.
            // recaptura a exceção
            System.out.println("Fatal error - program terminated.");
        }
    }
}
