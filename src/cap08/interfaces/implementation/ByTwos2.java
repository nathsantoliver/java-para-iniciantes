package cap08.interfaces.implementation;

// Implementa Series e adiciona getPrevious().
class ByTwos2 implements Series {
    int start;
    int val;
    int prev;

    ByTwos2() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start = -2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() {     // Adiciona um metodo não definido por Series
        return prev;
    }
}
