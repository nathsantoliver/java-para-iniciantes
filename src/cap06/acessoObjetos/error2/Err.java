package cap06.acessoObjetos.error2;

// Retorna um objeto definido pelo programador.
public class Err {
    String msg;    // mensagem de erro
    int severity;  // indicando a gravidade do erro

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
