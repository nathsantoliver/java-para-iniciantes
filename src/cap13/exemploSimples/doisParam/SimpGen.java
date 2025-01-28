package cap13.exemploSimples.doisParam;

// Demonstra TwoGen.
class SimpGen {
    public static void main(String[] args) {
        // Aqui, Integer é passado para T e String é passado para V.
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Exibe os tipos.
        tgObj.showTypes();

        // Obtém e exibe valores.
        int v = tgObj.getOb1();
        System.out.println("Value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}
