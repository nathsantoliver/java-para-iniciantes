package cap06.construtores;

// Inicializa um objeto com outro
public class Summation {
    int sum;

    // constrói a partir de um int.
    Summation(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
    }

    // constrói a partir de outro objeto.
    Summation(Summation ob) {    // Constrói um objeto a partir de outro.
        sum = ob.sum;
    }
}
