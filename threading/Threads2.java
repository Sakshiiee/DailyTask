class Threads2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Threads2 run = new Threads2();
        
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        
        t1.start();
        t2.start();
    }
}
