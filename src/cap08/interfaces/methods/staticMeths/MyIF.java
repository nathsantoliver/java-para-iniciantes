package cap08.interfaces.methods.staticMeths;

public interface MyIF {
    // Esta é uma declaração "comum" de metodo de uma interface.
    // Ela NÃO define uma implementação padrão.
    int getUserID();

    // Este é um metodo padrão. Observe que ele fornece
    // uma implementação padrão.
    default int getAdminID() {
        return 1;
    }

    // Este é um metodo de interface estático
    static int getUniversalID() {
        return 0;
    }
}
