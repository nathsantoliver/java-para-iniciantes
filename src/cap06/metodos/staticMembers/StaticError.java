package cap06.metodos.staticMembers;

public class StaticError {
    int denom = 3;  // uma variável de instância comum
    static int val = 1024;  // uma variável estática

    /* Erro! Não pode acessar uma variável não
    *  estática de dentro de um metodo estatico.
    * */
//    static int valDivDenom() {
//        return val / denom; // noã será compilado!
//    }
}
