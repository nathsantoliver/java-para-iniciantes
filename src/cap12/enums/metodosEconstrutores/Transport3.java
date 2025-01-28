package cap12.enums.metodosEconstrutores;

// Usa um construtor, uma variável de instância e um metodo com a enumeração.
enum Transport3 {
    // Observe os valores de inicialização.
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    // add uma variavel de instância
    private int speed;  // velocidade típica de cada meio de transporte

    // Construtor
    Transport3(int s) { // Adiciona um construtor.
        speed = s;
    }

    int getSpeed() {    // Adiciona um metodo.
        return speed;
    }
}
