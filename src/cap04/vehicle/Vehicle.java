package cap04.vehicle;

public class Vehicle {
    int passengers;  // número de passageiros
    int fuelcap;     // capacidade de armazenamento de combustível em galões
    int mpg;         // consumo de combustível em milhas por galão

    // Adiciona um construtor
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    Vehicle() {}

    // retorna a  autonomia
    int range() {
        return mpg * fuelcap;
    }

    // calcula o combustível necessário para cobrir uma determinada distância
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
