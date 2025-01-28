package cap13.tiposIlimitados;

// nesta versão de NumericsFns, o argumento de tipo T deve ser
// Number ou uma classe derivada de Number.
class NumericsFns<T extends Number> {
    T num;

    // Passsa para o construtor uma referência a um objeto numérico.
    NumericsFns(T n) {
        num = n;
    }

    // Retorna o recíproco.
    double reciprocal() {
        return 1 / num.doubleValue();   // Erro!
    }

    // Retorna o componente fracionário.
    double fraction() {
        return num.doubleValue() - num.intValue();  // Erro!
    }

    // ...
}

