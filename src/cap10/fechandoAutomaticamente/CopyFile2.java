package cap10.fechandoAutomaticamente;

/*  Versão de CopyFile que usa try-with-resources.
    Ela demonstra dois recursos (nesse caso arquivo)
    gerenciados pela mesma instrução try.
*/

import java.io.*;

class CopyFile2 {
    public static void main(String[] args) throws IOException {
        int i;

        // Primeiro, confirma se os dois arquivos foram especificados.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Abre e gerencia dois arquivos com a instrução try.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();     // Lê bytes em um arquivo e grava-os em outro.
                if (i != -1) fout.write(i);
            } while(i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
