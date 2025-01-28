package cap14.referenciaDeConstrutor;

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Cria uma referência ao construtor de MyClass.
        // Já que o metodo func() de MyFunc recebe um argumento,
        // new referencia o construtor parametrizado de MyClass
        // e não o construtor padrão.
        MyFunc myClassCons = MyClass::new;  // Uma referência de construtor.

        // Cria uma instância de MyClass usando essa referência de construtor.
        MyClass mc = myClassCons.func("Testing");

        // Usa uma instância de MyClass recém criasa.
        System.out.println("str in mc is " + mc.getStr());
    }
}
