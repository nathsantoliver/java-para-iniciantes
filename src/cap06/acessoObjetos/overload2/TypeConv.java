package cap06.acessoObjetos.overload2;

public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i);    // chama ob.f(int)
        ob.f(d);    // chama ob.f(double)

        ob.f(b);    // v2 => chama ob.f(byte) - aora, sem conversão de tipo

        ob.f(s);    // chama ob.f(int) - conversão de tipo
        ob.f(f);    // chama ob.f(double) - conversão de tipo
    }
}
