package cap06;

// Exibe um string de trás para frente usando a recursão.
public class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if(idx != str.length()-1) {
            backward(idx+1);
        }

        System.out.print(str.charAt(idx));
    }
}
