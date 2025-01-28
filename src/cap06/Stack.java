package cap06;

// Classe de pilha para caracteres.
public class Stack {
    private char stck[];    // esse array contém a pilha
    private int tos;        // topo da pilha

    // Constrói uma pilha vazia dado seu tamanho.
    Stack(int size) {
        stck = new char[size];  // allocate memory for stack
        tos = 0;
    }

    // Constrói uma pilha a partir de outra.
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // copia os elementos
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    // Constrói uma pilha com valores iniciais.
    Stack(char a[]) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // Insere caracteres na pilha.
    void push(char ch) {
        if(tos == stck.length) {
            System.out.println(" -- Stack is full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // Extrai um caractere da pilha.
    char pop() {
        if(tos == 0) {
            System.out.println(" -- Stack is empty.");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }

}
