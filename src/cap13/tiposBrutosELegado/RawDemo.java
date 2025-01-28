package cap13.tiposBrutosELegado;

// Demonstra o tipo bruto.
class RawDemo {
    public static void main(String[] args) {

        // Cria um objeto Gen para Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Cria um objeto Gen para Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Cria um objeto Gen de tipo bruto e dá a ele um valor Double.
        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("Value: " + d);

        // O uso de um tipo bruto pode levar a exceções de tempo de execução.

        // A coerção a seguir causa um erro de tempo de execução!
//        int i = (Integer) raw.getOb();  // Erro de tempo de execução.

        // Essa atribuição sobrepõe segurança de tipos.
        strOb = raw;    // Correto, mas pode gerar erros.
//        String str = strOb.getOb();     // Erro de tempo de execução.

        // Essa atribuição também sobrepõe segurança de tipos.
        raw = iOb;  // Correto, mas pode gerar erros.
//        d = (Double) raw.getOb();   // Erro de tempo de execução.

    }
}
