package cap09.naoCapturada;

// Deixaa a JVM tratar o erro.
class NotHandled {
    public static void main(String[] args) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera uma exceção de índicce fora do limite.
        nums[7] = 10;
    }
}
