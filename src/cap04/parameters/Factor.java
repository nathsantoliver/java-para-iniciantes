package cap04.parameters;

public class Factor {
    boolean isFactor(int a, int b) {
        if((b % a) == 0) return true;
        else return false;
    }
}
