package cap06.metodos.recursao;

// Um exemplo simples de recursão.
public class Factorial {
    // esta é uma função recursiiva.
    int factR(int n) {
        int result;

        if(n == 1) {
            return 1;
        }
        result = factR(n-1) * n;
        return result;
    }

    // Este é um equivalente iterativo.
    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
}
