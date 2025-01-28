package cap08.interfaces.referencias;

public interface Series {
    int getNext();  // retorna o próximo número da série
    void reset();   // reinicia
    void setStart(int x);  // define o valor inicial
}
