package cap05;

// Minha resolução
public class Media {
    public static void main(String[] args) {
        double notas[] = { 5.4, 8.0, 3.4, 4.5, 5.9, 7.1, 6.4, 2.5, 9.3, 9.75 };
        double somaTotal = 0;
        double avg;

        for (double nota : notas) {
            somaTotal += nota;
        }

        avg = somaTotal / notas.length;
        System.out.println(avg);
    }
}
