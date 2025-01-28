package cap06.tenteIsto6;

// Tente Isto 6-3 => rodando a classe Quicksort.java
public class QSDemo {
    public static void main(String[] args) {
        char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Original array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        // agora, classifica o array
        Quicksort.qsort(a);

        System.out.print("Sorted array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}
