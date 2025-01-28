package cap13.exemploSimples;

// Classe genérica simples.
// Aqui, T éum parâmetro de tipo que será
// substituído pelo tipo real quando um
// objeto de tipo Gen for criado.
class Gen<T> {      // Declara uma classe genérica. T é o parâmetro de tipo genérico.
    T ob;   // Declara um objeto de tipo T.

    // Passa para o construtor uma referência a um objeto de tipo T.
    Gen(T o) {
        ob = o;
    }

    // Retorna ob.
    T getOb() {
        return ob;
    }

    // Exibe o tipo de T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
