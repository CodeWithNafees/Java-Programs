class Table {
     void printTable(int n) {  
        synchronized(this)
        {
        for(int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
       }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) { this.t = t; }
    public void run() { t.printTable(5); }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) { this.t = t; }
    public void run() { t.printTable(100); }
}
class MyThread3 extends Thread {
    Table t;
    MyThread3(Table t) { this.t = t; }
    public void run() { t.printTable(3); }
}

public class thdeo11 {
    public static void main(String[] args) {
        Table obj = new Table();  // shared object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
