package cap14.referenciaDeMetodo.metodoInstancia.exemplo2;

class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum2 myNum = new MyIntNum2(12);
        MyIntNum2 myNum2 = new MyIntNum2(16);

        // Esta instrução faz inp referenciar o metodo de
        // instância isFactor().
        MyIntNumPredicate inp = MyIntNum2::isFactor;

        // A instrução a seguir chama isFactor() em myNum.
        result = inp.test(myNum, 3);
        if (result) System.out.println("3 is a factor of " + myNum.getNum());

        // A ppróxima instrução chama isFactor() em myNum2.
        result = inp.test(myNum2, 3);
        if (!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
