package cap11.criandoThread.melhorarCodigo;

// MyThread elhorada.
class MyThread2 implements Runnable {
    Thread thrd;    // Uma referência ao objeto thread é armazenada em thrd.

    // Constrói uma nova thread.
    MyThread2(String name) {
        thrd = new Thread(this, name);  // A thread é nomeada quando é criada.
        thrd.start();
    }

    // Começa a execução da nova thread.
    public void run() { // Threads começam a ser executadas aqui.
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
