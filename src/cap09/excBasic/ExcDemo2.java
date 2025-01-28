package cap09.excBasic;

// Demonstra execTest
class ExcDemo2 {
    public static void main(String[] args) {    // A exceção é capturada aqui.
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a excecção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
