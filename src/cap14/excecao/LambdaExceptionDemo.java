package cap14.excecao;

// Demonstra MyIOAction.
class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        // Esta lambda de bloco pode lançar uma IOException.
        // Logo, a IOExcepption deve ser especificada em uma cláusula
        // throws de ioAction() em MyIOAction.
        MyIOAction myIO = (rdr) -> {    // Esta expressão lambda pode gerar uma exceção.
            int ch = rdr.read();    // pode lançar IOException.
            // ...
            return true;
        };
    }
}
