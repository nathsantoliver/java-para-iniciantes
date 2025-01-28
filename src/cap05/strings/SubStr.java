package cap05.strings;

// Usa substring().
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        // constrói um substring
        String substr = orgstr.substring(5, 18);   // cria um novo string contendo o substring desejado

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
