package cap05.opTernario;

// Impede uma divisão por zero usando o operador ?.
public class NoZeroDiv2 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false) {
                System.out.println("100 / " + i + " is " + result);
            }
        }

    }
}
