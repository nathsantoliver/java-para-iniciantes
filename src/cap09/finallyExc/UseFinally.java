package cap09.finallyExc;

// Usa finally.
class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch(what) {
                case 0:
                    t = 10 / what;  // gera erro de divisoã por zero
                    break;
                case 1:
                    nums[4] = 4;    // gera erro de índice de array.
                    break;
                case 2:
                    return; // retorna do bloco try
            }
        } catch (ArithmeticException exc) {
            // captura a excecção
            System.out.println("Can't divide by Zero!");
            return; // retorna de catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura a excecção
            System.out.println("No matching element found.");
        } finally { // Essa instrução é executada quando saímos de blocos try/catch
            System.out.println("Leaving try.");
        }
    }
}
