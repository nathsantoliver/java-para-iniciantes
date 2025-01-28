package cap11.metodosSincronizados;

// Usa a sincronização para controlar o acesso.
class SumArray {
    private int sum;

    synchronized  int sumArray(int nums[]) {    // sumArray é sincronizado
        sum = 0;    // redefine sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(
                    "Running total for " + Thread.currentThread().getName() + " is " + sum
            );

            try {
                Thread.sleep(10);   // permite a alternância de tarefas
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}
