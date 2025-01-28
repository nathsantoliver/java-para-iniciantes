package cap11.waitEnotify;

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread7 mt1 = new MyThread7("Tick", tt);
        MyThread7 mt2 = new MyThread7("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
