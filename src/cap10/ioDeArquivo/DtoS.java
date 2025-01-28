package cap10.ioDeArquivo;

// Utilitário 'disco para tela' simples que demonstra um FileReader.

import java.io.*;

class DtoS {
    public static void main(String[] args) {
        String s;

        // Cria e usa um FileReader encapsulado em um BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            while((s = br.readLine()) != null) {    // Lê linhas no arquivo e as exibe na tela.
                System.out.println(s);
            }

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
