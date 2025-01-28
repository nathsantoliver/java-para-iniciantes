package cap14.referenciaDeMetodo.metodoInstancia.exemplo2;

// Usa uma referência de metodo de instância para referenciar
// qualquer instância.

// Interface funcional para predicados numéricos que opera com um
// objeto de tipo MyIntNum e um valor inteiro.
interface MyIntNumPredicate {

    boolean test(MyIntNum2 mv, int n);

}
