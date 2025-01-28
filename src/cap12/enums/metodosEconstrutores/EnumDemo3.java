package cap12.enums.metodosEconstrutores;

// Demonstra Transport3.
class EnumDemo3 {
    public static void main(String[] args) {
        Transport3 tp;

        // Exibe a velocidade de um avião.
        System.out.println(
                        "Typical speed for an airplane is " +
                        Transport3.AIRPLANE.getSpeed() +    // Obtém a velocidade chamando getSpeed().
                        " miles per hour.\n"
        );

        // Exibe todos os meios de transporte e velocidades.
        System.out.println("All Transport speeds: ");
        for(Transport3 t : Transport3.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}
