package cap10.acessoAleatorio;

// Demonstra arquivos de acesso aleatório.

import java.io.*;

class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = { 19.9, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        // Abre e usa um arquivo de acesso aleatório.
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            // Grava valores no arquivo.
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Agora, lê os valores específicos.
            // Usa seek() para configurar o ponteiro do arquivo.
            raf.seek(0);    // Busca o primeiro double.
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8);    // Busca o segundo double.
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3);    // Busca o quarto double.
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Agora, lê os valores alternadamente.
            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i);    // Busca o i-ésimo double.
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
