package cap14.referenciaDeMetodo.metodoInstancia.exemplo2;

// Esta classe armazena um valor int e define o metodo
// de instância isFactor(), que retorna true quando seu
// argumento é fator do valor armazenado.
class MyIntNum2 {
    private int v;

    MyIntNum2(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    // Retorna true se n for fator de v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
