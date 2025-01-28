package cap06.acessoObjetos.overload2;

/*
    Conversões de tipo automáticas podem afetar
    a definição do método sobrecarregado.
 */
// Adiciona f(byte)
public class Overload2 {
    void f(byte x) {    // Esta versão especifiica um parâmetro byte
        System.out.println("Inside f(byte): " + x);
    }
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
