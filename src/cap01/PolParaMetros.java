package cap01;

public class PolParaMetros {
    public static void main(String[] args) {
        double pol, metro;
        int contador = 0;

        for (pol = 1; pol <= 144; pol++) {
            metro = pol / 39.37;  // converte para metros
            System.out.println(pol + " polegadas é " + metro + " metros.");

            contador++;

            // a cada 12 linhas, exibe uma linha em branco
            if (contador == 12) {
                System.out.println();
                contador = 0;  // zera o contador de linhas
            }
        }
    }
}
