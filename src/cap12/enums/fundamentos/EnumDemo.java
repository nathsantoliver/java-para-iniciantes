package cap12.enums.fundamentos;

// Demonstra Transport.
class EnumDemo {
    public static void main(String[] args) {
        Transport tp;   // Declara uma referência Transport.

        tp = Transport.AIRPLANE;    // Atribui a tp a constante AIRPLANE.

        // Exibe um valor da enum.
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Compara dois valores da enum.
        if(tp == Transport.TRAIN) {     // Compara dois objetos Transport em busca de igualdade.
            System.out.println("tp contains TRAIN.\n");
        }

        // Usa um enum para controlar uma instrução switch.
        switch (tp) {   // Usa uma enumeração para controlar uma instrução switch.
            case CAR:
                System.out.println("A car carries people.");
                break;
            case TRUCK:
                System.out.println("A truck carries freight.");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
