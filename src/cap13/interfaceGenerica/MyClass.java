package cap13.interfaceGenerica;

// Implementa Containment usando um array para armazenar os valores.
// Toda classe que implemente uma interface genérica tambmé deve ser genérica.
class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o) {
        arrayRef = o;
    }

    // Implementa contains()
    public boolean contains(T o) {
        for (T x : arrayRef) {
            if(x.equals(o)) return true;
        }
        return false;
    }
}
