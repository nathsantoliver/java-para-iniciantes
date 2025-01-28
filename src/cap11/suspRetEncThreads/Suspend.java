package cap11.suspRetEncThreads;

class Suspend {
    public static void main(String[] args) {
        MyThread8 ob1 = new MyThread8("My Thread");

        try {
            Thread.sleep(1000);     // Permite que a thread ob1 comece a ser executada.

            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();

        } catch(InterruptedException exc) {
            System.out.println("Main thread Interrupted.");
        }

        // Espera a thread terminar.
        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread Interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
