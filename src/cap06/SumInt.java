package cap06;

// Questao 13
public class SumInt {
    int sum(int ... n) {
        int result = 0;

        for (int i = 0; i < n.length; i++) {
            result += n[i];
        }

        return result;
    }
}
