package cap09.finallyExc;

class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
