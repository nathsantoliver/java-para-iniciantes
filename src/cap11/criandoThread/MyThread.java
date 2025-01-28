package cap11.criandoThread;

// Cria uma thread implementando Runnable
class MyThread implements Runnable {    // Objetos de MyThread podem ser executados em suas próprias
                                        // threads, porque MyThread implementa Runnable.
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    // Ponto de entrada da thread.
    public void run() { // Threads começam a ser executadas aqui.
        System.out.println(thrdName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}
