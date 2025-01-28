package cap06.metodos.staticMembers;

// Usa uma variável estática.
public class StaticDemo {
    int x;  // uma variável de instância comum
    static int y;  // uma variável estática. - Há uma cópia de y para todos os objetos compartilharem

    // Retorna a soma da variável de instância x
    // e a variável estática y.
    int sum() {
        return x + y;
    }
}
