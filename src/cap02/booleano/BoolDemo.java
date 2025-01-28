package cap02.booleano;

// Demonstra valores booleanos

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // um valor booleano pode controlar a instrução if
        if (b) System.out.println("This is executed.");

        // o resultado de um operadoor relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
