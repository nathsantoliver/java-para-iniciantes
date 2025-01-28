package cap09.subclasses.excPersonal;

// Usa uma exceção personalizada.

// Cria uma exceção.
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}
