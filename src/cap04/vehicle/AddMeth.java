package cap04.vehicle;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");

        minivan.range();    // exibe a autonomia de minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");

        sportscar.range();  // exibe a autonomia de sportscar
    }
}
