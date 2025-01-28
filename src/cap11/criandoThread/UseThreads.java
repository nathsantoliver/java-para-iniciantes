package cap11.criandoThread;

// Demonstra MyThread
class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Primeiro, constrói um objeto MyThread.
        MyThread mt = new MyThread("Child #1"); // Cria um objeto executável.

        // Em seguida, constrói uma thread a partir desse objeto.
        Thread newThrd = new Thread(mt);   // Constrói uma thread nesse objeto

        // Para concluir, começa a execução da thread.
        newThrd.start();    // Começa a executar a thread.

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
