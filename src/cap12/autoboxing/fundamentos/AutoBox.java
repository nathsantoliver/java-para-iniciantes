package cap12.autoboxing.fundamentos;

// Demonstra o autoboxing/unboxing.
class AutoBox {
    public static void main(String[] args) {

        Integer iOb = 100;  // faz o autobox de um int.

        int i = iOb;

        System.out.println(i + " " + iOb);  // exibe 100 100

    }
}
