
class Hello  {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("Hello");
        }
    }
}

class Hi {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("Hi");
        }
    }
}

public class ThreadTimeDemo1 {
    public static void main(String[] args) {
        // ---------- With Threads ----------
        long start1 = System.currentTimeMillis();

        Hello h = new Hello();
        Hi h1 = new Hi();
        h.run();
        h1.run();

    

        long end1 = System.currentTimeMillis();
        System.out.println("Time taken WITH threads: " + (end1 - start1) );

      
    }
}

