package cap07.tenteIsto7;

// Estende Vehicle para criar a especiallização Truck.
public class Truck extends Vehicle {
    private int cargocap;  // capacidade de transporte ded carga em libras.

    // Construtor para Trick.
    Truck(int p, int f, int m, int c) {
        // Inicializa membros de Vehicle usando o construtor de Vehicle.
        super(p, f, m);
        cargocap = c;
    }

    // Metodos acessadores para cargocap.
    int getCargocap() {
        return cargocap;
    }

    void putCargocap(int c) {
        cargocap = c;
    }
}
