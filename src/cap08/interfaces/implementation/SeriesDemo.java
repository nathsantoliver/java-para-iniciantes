package cap08.interfaces.implementation;

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        System.out.println("\nReseting");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }
    }
}
