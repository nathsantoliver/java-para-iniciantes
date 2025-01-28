package cap07.tenteIsto7;

public class Vehicle {
    private int passengers;  // número de passageiros
    private int fuelcap;     // capacidade de armazenamento de combustível em galões
    private int mpg;         // consumo de combustível em milhas por galão

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

    // Metodos de acesso de variáveis de instância.

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        fuelcap = f;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int m) {
        mpg = m;
    }
}
