package cap11.criandoNThreads;

// Demonstra MyThread3.
class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Cria e começa a executar três threads.
        MyThread3 mt1 = new MyThread3("Child #1");
        MyThread3 mt2 = new MyThread3("Child #2");
        MyThread3 mt3 = new MyThread3("Child #3");

        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
