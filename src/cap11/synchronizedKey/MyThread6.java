package cap11.synchronizedKey;

public class MyThread6 implements Runnable {
    Thread thrd;
    static SumArray2 sa = new SumArray2();
    int a[];
    int answer;

    // Constrói uma nova thread.
    MyThread6(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();   // inicia a thread
    }

    // Começa a execução da nova thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        // sincroniza as chamadas a sumArray()
        synchronized (sa) {     // Aqui, as chamadas a sumArray() em sa são sincronizadas.
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}
