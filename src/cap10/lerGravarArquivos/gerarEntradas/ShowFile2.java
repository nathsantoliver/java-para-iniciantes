package cap10.lerGravarArquivos.gerarEntradas;

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Primeiro verifica se um arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);     // Abre o arquivo.
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // lê bytes at éo EOF ser alcançado
            do {
                i = fin.read();     // Lê o arquivo.
                if (i != -1) System.out.print((char) i);
            } while(i != -1);   // Quando i for igual a -1, o fim do arquivo foi alcançado.
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        } finally {     // Usa uma cláusula finally para fechar o arquivo.
            try {
                fin.close();    // Fecha o arquivo.
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}
