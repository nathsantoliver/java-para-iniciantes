package cap10.lerGravarArquivos.gerarEntradas;

/*  Esta variação encapsula o código que abre
    e acessa o arquivo dentro do mesmo bloco try.
    O arquivo é fechado pelo bloco finally.
*/

import java.io.*;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;     // Aqui, fin é inicializada com null.

        // Primeiro, confirma se um nome do arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // A seguir abre um arquivo, lê caracteres até EOF ser alcançado
        // e então fecha o arquivoo via um bloco finally.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();     // Lê o arquivo.
                if (i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        } catch (IOException exc) {
            System.out.println("An I/O Error occurred.");
            // ou System.out.println("I/O Error: " + exc);
        } finally {
            // Fecha o arquivo em todos os casos
            try {
                if (fin != null) fin.close();    // Só fecha fin se não for null.
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}
