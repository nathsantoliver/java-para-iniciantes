package cap09.excBasic;

// Demonstra o tratamento de exceções.
class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {   // Cria um bloco try
            System.out.println("Before exception is generated.");

            // Gera uma exceção de índice fora dos limites.
            nums[7] = 10;   // Tenta indexar excedendo o limite de nums.
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {  // Captura erros nos limites do array.
            // captura a exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
