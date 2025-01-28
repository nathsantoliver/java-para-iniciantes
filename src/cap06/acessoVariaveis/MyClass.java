package cap06.acessoVariaveis;

// Acesso público versus privado.
public class MyClass {
    private int alpha;    // acesso privado
    public int beta;      // acesso público
    int gamma;            // acesso padrão

	/* Métodos para acessar alpha. Não há problema
		 em um membro de uma classe acessar um membro
		 privado da mesma classe.
	*/
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
