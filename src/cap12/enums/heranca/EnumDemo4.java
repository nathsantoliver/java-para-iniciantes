package cap12.enums.heranca;

// Demonstra ordinal() e compareTo().
class EnumDemo4 {
    public static void main(String[] args) {
        Transport4 tp1, tp2, tp3;

        // Obtém todos os valores ordinais usando ordinal().
        System.out.println("Here are all Transport constants and their ordinal values: ");
        for (Transport4 t : Transport4.values()) {
            System.out.println(t + " " + t.ordinal());  // Obtém os valores ordinais.
        }

        tp1 = Transport4.AIRPLANE;
        tp2 = Transport4.TRAIN;
        tp3 = Transport4.AIRPLANE;

        System.out.println();

        // Demonstra compareTo().
        if (tp1.compareTo(tp2) < 0) {
            System.out.println(tp1 + " comes before " + tp2);
        }

        if (tp1.compareTo(tp2) > 0) {
            System.out.println(tp2 + " comes before " + tp1);
        }

        if (tp1.compareTo(tp3) == 0) {
            System.out.println(tp1 + " equals " + tp3);
        }
    }
}
