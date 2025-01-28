package cap06.metodos.staticMembers;

// Usa um bloco estatico
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {    // Esse bloco  é executado quando a classe é carregada.
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
