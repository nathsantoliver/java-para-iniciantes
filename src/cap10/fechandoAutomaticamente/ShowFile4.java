package cap10.fechandoAutomaticamente;

import java.io.*;

/*  Esta versão do programa ShowFile usa uma instrução try-with-resources
    para fechar automaticamente um arquivo quando ele não é mais necessário.
*/

class ShowFile4 {
    public static void main(String[] args) {
        int i;

        // Primeiro, confirma se um nome do arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // O código a seguir usa try-with-resources para abrir um arquivo
        // e depois fechá-lo automaticamente quando o bloco try é deixado.
        try(FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();     // Lê o arquivo.
                if (i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
