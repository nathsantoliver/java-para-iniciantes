package cap09.excBasic;

// Uma exceção pode ser gerada por um metodo e capturada por outro.
class ExcTest {
    // Gera uma exceção.
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera uma exceção de índice fora do limite
        nums[7] = 10;   // A exceção é gerada aqui.
        System.out.println("this won't be displayed");
    }
}
