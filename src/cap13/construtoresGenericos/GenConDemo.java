package cap13.construtoresGenericos;

class GenConDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);

        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}
