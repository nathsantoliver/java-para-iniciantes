package cap10.fluxoDeBytes.entrada;

import java.io.IOException;

// Lê um array de bytes a partir do teclado.
class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data);   // Lê um array de bytes a partir do teclado.
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
