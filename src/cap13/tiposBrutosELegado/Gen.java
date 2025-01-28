package cap13.tiposBrutosELegado;

// Demonstra um tipo bruto.
class Gen<T> {
    T ob;   // Declara um objeto de tipo T.

    // Passa para o construtor uma referência a um objeto de tipo T.
    Gen(T o) {
        ob = o;
    }

    // Retorna ob.
    T getOb() {
        return ob;
    }
}
