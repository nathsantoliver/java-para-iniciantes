package cap06;

// Demonstra a classe SumInt
public class SumDemo {
    public static void main(String[] args) {
        SumInt siObj = new SumInt();

        int total = siObj.sum(1, 2, 3);
        System.out.println("Sum is " + total);

        total = siObj.sum(1, 2, 3, 4, 5);
        System.out.println("Sum is " + total);
    }
}
