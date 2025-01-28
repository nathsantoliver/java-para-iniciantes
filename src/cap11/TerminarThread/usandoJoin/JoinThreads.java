package cap11.TerminarThread.usandoJoin;

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread4 mt1 = new MyThread4("Child #1");
        MyThread4 mt2 = new MyThread4("Child #2");
        MyThread4 mt3 = new MyThread4("Child #3");

        try {
            // Espera até a thread especificada terminar.
            mt1.thrd.join();
            System.out.println("Chiild #1 is joined.");
            mt2.thrd.join();
            System.out.println("Chiild #2 is joined.");
            mt3.thrd.join();
            System.out.println("Chiild #3 is joined.");
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
