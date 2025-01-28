package cap06.acessoObjetos;

// Objetos são passados por suas referências.
public class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }
    /* Passa um objeto. Agora, os valores ob.a e ob.b
       do objeto usados na chamada serão alterados. */
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
