package cap14.referenciaDeMetodo.metodoStatic;

// Esta classe define três metodos estáticos que verificam um inteiro
// em relação a alguma condição.
class MyIntPredicates {
    // Um metodoo estático que retorna true quando um número é primo.
    static boolean isPrime(int n) {
        if(n < 2) return false;

        for (int i = 2; i < n/i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Um metodo estático que retorna true quando um número é par.
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    // Um metod estático que retorna true quando um número é positivo.
    static boolean isPositive(int n) {
        return n > 0;
    }
}
