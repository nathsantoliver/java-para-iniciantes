package cap13.exemploSimples.doisParam;

// Classe genérica simples com dois parâmetros de tipos: T e V.
class TwoGen<T, V> {    // Usa dois parâmetros de tipo.
    T ob1;
    V ob2;

    // Passa para o construtor referências a objetos de tipo T e V.
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Exibe os tipos ded T e V.
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
