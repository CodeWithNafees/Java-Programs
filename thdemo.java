class Hello1 extends Thread {
    public void run() {
        Thread t=Thread.currentThread();
         System.out.println(t.isAlive());

       System.out.println(t.getName());
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
        Thread t=Thread.currentThread();
       System.out.println(t.getName());
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("Hi");
        }
    }
}

public class thdemo {
    public static void main(String[] args) {
        // ---------- With Threads ----------
        Thread t=Thread.currentThread();
       System.out.println(t.getName());
        Hello1 h = new Hello1();
        Hi h1 = new Hi();
        
       System.out.println(h.isAlive());
        h.start();
        h1.start();
        
      
       System.out.println(h.getName());
       System.out.println(h.getId());
       System.out.println(h.getPriority());
       h.setPriority(Thread.MAX_PRIORITY);
       h.setName("hello");
       System.out.println();
      System.out.println(h.getName());
       System.out.println(h.getId());
       System.out.println(h.getPriority());
        try {
            h.join();   // wait until thread finishes
            h1.join();
        } catch (Exception e) {}

       System.out.println(h.isAlive());
       

    }
}

