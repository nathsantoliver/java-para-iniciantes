package cap12.autoboxing.metodos;

// O autoboxing/unboxing ocorre com parâmetros
// e valores de retorno de metodos.
class AutoBox2 {
    // Esse metodo tem um parâmetro Integer.
    static void m(Integer v) {      // Recebe um Integer.
        System.out.println("m() received " + v);
    }

    // Esse metodo retorna um int.
    static int m2() {       // Retorna um int.
        return 10;
    }

    // Esse metodo retorna um Integer.
    static Integer m3() {       // Retorna um Integer..
        return 99;      // faz o autoboxing de 99 para um Integer.
    }

    public static void main(String[] args) {
        // Passa um int para m(). Já que m() tem um parâmetro Integer,
        // o valor int passado é encapsulado automaticamente.
        m(199);

        // Aqui, iOb recebe o valor int retornado por m2().
        // Esse valor é encapsulado eutomaticamente para
        // poder ser atribuído a iOb.
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        // Em seguida, m3() é chamado. Ele retorna um valor Integer
        // que é encapsulado automaticamente em um int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Agora, Mathsqrt() é chamado com iOb como argumento.
        // Nesse caso, iOb sofre autoboxing e o seu valor é promovido
        // a double, que é o tipo que sqrt() precisa.
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}
