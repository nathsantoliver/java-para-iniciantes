package cap13.construtoresGenericos;

// Usa um construtor genérico.
class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}
