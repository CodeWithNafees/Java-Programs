class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("Hello");
        }
    }
}

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("Hi");
        }
    }
}

public class ThreadTimeDemo {
    public static void main(String[] args) {
        // ---------- With Threads ----------
        long start1 = System.currentTimeMillis();

        Hello h = new Hello();
        Hi h1 = new Hi();
        h.start();
        h1.start();

        try {
            h.join();   // wait until thread finishes
            h1.join();
        } catch (Exception e) {}

        long end1 = System.currentTimeMillis();
        System.out.println("Time taken WITH threads: " + (end1 - start1) );

    }
}

