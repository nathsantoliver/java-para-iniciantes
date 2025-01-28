package cap13.interfaceGenerica;

// Exemplo de interface genérica.

// Uma interface genérica que lida com armazenamento.
// Esta interface requer que a classe usuária tenha um ou mais valores.
interface Containment<T> {      // Interface genérica.
    // O metodo contains() verifica se um item especificado está
    // contidoo dentro de um objeto que implementa Containment.
    boolean contains(T o);

}
