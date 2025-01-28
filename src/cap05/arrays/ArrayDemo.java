package cap05.arrays;

// Demonstra um array unidimensional
public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i+1) {
            sample[i] = i;
            System.out.println("This is sample[" + i + "]: " + sample[i]);
        }
    }
}
