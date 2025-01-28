package cap06.acessoVariaveis;

// Rodando os parâmetros da classe MyClass
public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        // O acesso a alpha só é permitido por intermédio de seus métodos acessadores.
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // Você não pode acessar alpha dessa forma:
        // ob.alpha = 10;  // Errado! alpha é privado!

        // Eessas linhas estão corretas porque beta e gamma são públicos.
        ob.beta = 88;
        ob.gamma = 99;
    }
}
