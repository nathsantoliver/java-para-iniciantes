package cap05.arrays;

// Demonstra uma situação que excede um array.
public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        // gera a transposição de um array
        for (i = 0; i < 100; i = i+1) {
            sample[i] = i;
        }
    }
}
