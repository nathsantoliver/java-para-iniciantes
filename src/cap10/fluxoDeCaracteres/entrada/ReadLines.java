package cap10.fluxoDeCaracteres.entrada;

// Lê um String no console usando um BufferesReader.
import java.io.*;

class ReadLines {
    public static void main(String[] args) throws IOException {
        // Cria um BufferedReader usando System.in.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");

        do {
            // Usa o metodo readLine() de BufferedReader para ler uma linha de texto.
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
