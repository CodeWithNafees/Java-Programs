class Table {
     void printTable(int n) {  
        synchronized(this)
        {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n +" X "+ i+" = "+n * i);
        }
        System.out.println();
        try {
                Thread.sleep(1000);
            } catch (Exception e) {}
       }
       
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) { this.t = t; }
    public void run() { t.printTable(1); }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) { this.t = t; }
    public void run() { t.printTable(2); }
}
class MyThread3 extends Thread {
    Table t;
    MyThread3(Table t) { this.t = t; }
    public void run() { t.printTable(3); }
}
class MyThread4 extends Thread {
    Table t;
    MyThread4(Table t) { this.t = t; }
    public void run() { t.printTable(4); }
}
class MyThread5 extends Thread {
    Table t;
    MyThread5(Table t) { this.t = t; }
    public void run() { t.printTable(5); }
}
class MyThread6 extends Thread {
    Table t;
    MyThread6(Table t) { this.t = t; }
    public void run() { t.printTable(6); }
}
class MyThread7 extends Thread {
    Table t;
    MyThread7(Table t) { this.t = t; }
    public void run() { t.printTable(7); }
}
class MyThread8 extends Thread {
    Table t;
    MyThread8(Table t) { this.t = t; }
    public void run() { t.printTable(8); }
}
class MyThread9 extends Thread {
    Table t;
    MyThread9(Table t) { this.t = t; }
    public void run() { t.printTable(9); }
}
class MyThread10 extends Thread {
    Table t;
    MyThread10(Table t) { this.t = t; }
    public void run() { t.printTable(10); }
}

public class syncho {
    public static void main(String[] args) {
        Table obj = new Table();  // shared object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);
        MyThread4 t4 = new MyThread4(obj);
        MyThread5 t5 = new MyThread5(obj);
        MyThread6 t6 = new MyThread6(obj);
        MyThread7 t7 = new MyThread7(obj);
        MyThread8 t8 = new MyThread8(obj);
        MyThread9 t9 = new MyThread9(obj);
        MyThread10 t10 = new MyThread10(obj);
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t6.setPriority(6);
        t7.setPriority(7);
        t8.setPriority(8);
        t9.setPriority(9);
        t10.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}

