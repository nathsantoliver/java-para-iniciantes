package cap03.forstatement;

// Um laço for sendo executado em sentido negativo.
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x > -100; x -= 5) {  // a variável de controle de laço é sempre decrementada em 5 unidades
            System.out.println(x);
        }
    }
}
