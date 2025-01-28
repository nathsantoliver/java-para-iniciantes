package cap04.parameters;

// um exemplo simples que usa um parâmetro
public class ChkNum {
    // retorna true se x for par
    boolean isEven(int x) {     // aqui, x é um parâmetro inteiro de isEven()
        if((x%2) == 0) return true;
        else return false;
    }
}
