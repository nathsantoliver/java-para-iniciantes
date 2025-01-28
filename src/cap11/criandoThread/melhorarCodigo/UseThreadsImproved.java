package cap11.criandoThread.melhorarCodigo;

// Demonstra MyThread2.
class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt = new MyThread2("Child #1");   // Agora thread começa quando é criada.

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
