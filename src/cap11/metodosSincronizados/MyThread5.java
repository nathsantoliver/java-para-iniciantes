package cap11.metodosSincronizados;

class MyThread5 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Constrói uma nova thread.
    MyThread5(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();   // inicia a thread
    }

    // Começa a execução da nova thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}
