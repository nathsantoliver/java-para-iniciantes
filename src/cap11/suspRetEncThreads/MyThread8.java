package cap11.suspRetEncThreads;

public class MyThread8 implements Runnable {
    Thread thrd;

    boolean suspended;  // Suspended a thread quando igual a true
    boolean stopped;    // Encerra a thread quando igual a true.

    // Constrói uma nova thread.
    MyThread8(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();   // inicia a thread
    }

    // Este é o ponto de entrada da thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.println(i + " ");
                if((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Usa um bloco sincronizado para verificar suspended e stopped.
                synchronized(this) {    // Esse bloco sincronizado verifica suspended e stopped.
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }

        System.out.println(thrd.getName() + " ending.");
    }

    // Encerra a thread.
    synchronized void mystop() {
        stopped = true;

        // O código a seguir assegura que uma thread suspensa possa ser encerrada.
        suspended = false;
        notify();
    }

    // Suspende a thread.
    synchronized void mysuspend() {
        suspended = true;
    }

    // Retoma a thread.
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
