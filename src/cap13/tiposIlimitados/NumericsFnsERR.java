package cap13.tiposIlimitados;

// NumericsFns tenta (sem sucesso) criar uma classe genérica que possa executar várias
// funções numéricas, como calcular recíproco ou o componente fracionário, dado qualquer
// tipo de número.
class NumericsFnsERR<T> {
    T num;

    // Passsa para o construtor uma referência a um objeto numérico.
    NumericsFnsERR(T n) {
        num = n;
    }

    // Retorna o recíproco.
//    double reciprocal() {
//        return 1 / num.doubleValue();   // Erro!
//    }

    // Retorna o componente fracionário.
//    double fraction() {
//        return num.doubleValue() - num.intValue();  // Erro!
//    }

    // ...
}
