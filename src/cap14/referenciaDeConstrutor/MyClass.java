package cap14.referenciaDeConstrutor;

class MyClass {
    private String str;

    // este construtor recebe um argumento.
    MyClass(String s) {
        str = s;
    }

    // Este é o construtor padrão.
    MyClass() {
        str = "";
    }

    // ...

    String getStr() {
        return str;
    }
}
