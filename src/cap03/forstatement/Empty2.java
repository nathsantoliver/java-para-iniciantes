package cap03.forstatement;

// Retira mais uma parte do laço for
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // move a inicializaçoã para fora do laço

        for (; i < 10; ) {   // as expressões de inicialização e iteração estão faltando
            System.out.println("Pass #" + i);
            i++;  // incrementa a variável de controle de laço
        }
    }
}
