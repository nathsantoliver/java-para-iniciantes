package cap11.TerminarThread;

class MyThread3 implements Runnable {
    Thread thrd;

    // Constrói uma nova thread.
    MyThread3(String name) {
        thrd = new Thread(this, name);
        thrd.start();   // Inicia a thread.
    }

    // Começa a execução da nova thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
