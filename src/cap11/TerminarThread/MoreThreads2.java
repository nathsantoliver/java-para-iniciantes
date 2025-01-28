package cap11.TerminarThread;

// Usa isAlive().
class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Cria e começa a executar três threads.
        MyThread3 mt1 = new MyThread3("Child #1");
        MyThread3 mt2 = new MyThread3("Child #2");
        MyThread3 mt3 = new MyThread3("Child #3");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }

        } while (mt1.thrd.isAlive() ||
                 mt2.thrd.isAlive() ||      // Espera até todas as threads terminarem.
                 mt3.thrd.isAlive());

        System.out.println("Main thread ending.");
    }
}
