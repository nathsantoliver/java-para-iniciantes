package cap12.enums.valueEvalueOf;

// Usa os metodos de enumeração internos.
class EnumDemo2 {
    public static void main(String[] args) {
        Transport2 tp;

        System.out.println("Here are all Transport2 constants");

        // usa values()
        Transport2 allTransports[] = Transport2.values(); // Obtém um array de constantes Transport2.
        for(Transport2 t : allTransports) {
            System.out.println(t);
        }
        System.out.println();

        // usa valuesOf
        tp = Transport2.valueOf("AIRPLANE"); // Obtém a constante de nome AIRPLANE.
        System.out.println("tp contains " + tp);
    }
}
