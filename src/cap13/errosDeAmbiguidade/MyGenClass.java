package cap13.errosDeAmbiguidade;

// Ambiguidade causada por erasure em metodos sobrecarregados.
class MyGenClass<T, V> {
    T ob1;
    V ob2;

    // ...

    // Esses dois metodos sobrecarregados são ambiguos e não
    // serão compilados.
//    void set(T o) {
//        ob1 = o;
//    }

//    void set(V o) {
//        ob2 = o;
//    }


}
