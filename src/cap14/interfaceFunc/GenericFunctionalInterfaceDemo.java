package cap14.interfaceFunc;

// Demonstra SomeTest
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Esta expressão lambda determina se um inteiro
        // é fator de outro.
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        System.out.println();

        // A próxima expressão lambda determina se um Double
        // é fator de outro.
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor of 212.0");
        System.out.println();

        // Esta expressão lambda determina se um string faz
        // parte de outro.
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";

        System.out.println("Testing string: " + str);

        if (isIn.test(str, "face"))
            System.out.println("'face' is found.");
        else
            System.out.println("'face' not found.");

    }
}
