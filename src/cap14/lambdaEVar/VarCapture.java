package cap14.lambdaEVar;

// Demonstra MyFunc.
class VarCapture {
    public static void main(String[] args) {
        // Uma variável local que pode ser capturada.
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Este uso ded num está correto. Ele não modifica num.
            int v = num + n;

            // Porém, a instrução a seguir não é válida porque tenta
            // modificar o valor de num.
//            num++;

            return v;
        };

        // Usa uma expressão lambda. Esta instrução exibirá 18.
        System.out.println(myLambda.func(8));

        // A linha a seguir também causaria um erro, porque removeria
        // de num o status de efetivamente final.
//        num = 9;

    }
}
