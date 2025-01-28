package cap13.exemploSimples;

// Demonstra a classe genérica.
class GenDemo {
    public static void main(String[] args) {
        // Cria uma referência Gen para Integers.
        Gen<Integer> iOb;   // Cria uma referência a um objeto de tipo Gen<Integer>.

        // Cria um objeto Gen<Integer> e atribui sua referência a iOb.
        // Observe o uso de autoboxing do valor 88 dentro de objeto Integer.
        iOb = new Gen<Integer>(88);     // Instancia um objeto de tipo Gen<Integer>.

        // Exibe o tipo de dado usado por iOb.
        iOb.showType();

        // Obtém o valor de iOb. Observe que nenhuma coerção é necessária.
        int v = iOb.getOb();
        System.out.println("Value: " + v);

        System.out.println();

        // Cria um objeto Gen para Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Exibe o tipo de dado usado por strOb
        strOb.showType();

        // Obtém o valor ded strOb. Novamente, observe que nenhuma coerção é necessária.
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}
