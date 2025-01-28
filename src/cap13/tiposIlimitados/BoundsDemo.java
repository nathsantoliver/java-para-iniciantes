package cap13.tiposIlimitados;

// Demonstra NumericsFns.
public class BoundsDemo {
    public static void main(String[] args) {

        NumericsFns<Integer> iOb = new NumericsFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());

        System.out.println();

        NumericsFns<Double> dOb = new NumericsFns<Double>(5.25);

        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());

        // Essa parte não será compilada porque String não é subclasse de Number.
//        NumericsFns<String> strOb = new NumericsFns<String>("Error");
    }
}
