package cap11.waitEnotify;

// Usa wait() e notify() para similar um relógio funcionando.
class TickTock {

    String state;   // contém o estado do relógio

    synchronized void tick(boolean running) {
        if(!running) {  // interrompe o relógio
            state = "ticked";
            notify();   // notifica qualquer thread que estiver esperando
            return;
        }

        System.out.println("Tick");

        state = "ticked";   // define o estado atual com ticked

        notify();   // permite que tock() seja executado => tick() notifica tock().
        try {
            while(!state.equals("tocked")) {
                wait(); // espera tock() terminar => tick() espera tock().
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {  // interrompe o relógio
            state = "tocked";
            notify();   // notifica qualquer thread que estiver esperando.
            return;
        }

        System.out.println("Tock");

        state = "tocked";   // define o estado atual com tocked

        notify();   // permite que tick() seja executado => tock() notifica tick().
        try {
            while(!state.equals("ticked")) {
                wait(); // espera tick() terminar => tock() espera tick().
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}
