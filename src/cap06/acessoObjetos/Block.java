package cap06.acessoObjetos;

// Objetos podem ser passados para os métodos.
public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Retorna true se ob definir o mesmo bloco.
    boolean sameBlock(Block ob) {  // Usa um tipo de objeto no parâmetro.
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    // Retorna true se ob tiver o mesmo volume.
    boolean sameVolume(Block ob) {  // Usa um tipo de objeto no parâmetro.
        if(ob.volume == volume) return true;
        else return false;
    }

}
