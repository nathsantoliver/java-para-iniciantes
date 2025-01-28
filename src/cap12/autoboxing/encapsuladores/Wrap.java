package cap12.autoboxing.encapsuladores;

// Demonstra o boxing e o unboxing manuais com um encapsulador de tipo.
class Wrap {
    public static void main(String[] args) {

        // Essa forma está depreciada.
        Integer iOb = new Integer(100);     // Encapsula manualmente o valor 100.

        int i = iOb.intValue();     // Extrai manualmente o valor de iOb.

        System.out.println(i + " " + iOb);  // exibe 100 100

    }
}
