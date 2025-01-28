package cap09.throwable;

// Usando os metodos de Throwable
class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera umaexceção de índice fora do limite
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}
