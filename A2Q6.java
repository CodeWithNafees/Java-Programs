class Swapper {
    void swap(int a, int b) {
        System.out.println("Before swapping (int): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (int): a = " + a + ", b = " + b);
    }

    void swap(double a, double b) {
        System.out.println("Before swapping (double): a = " + a + ", b = " + b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (double): a = " + a + ", b = " + b);
    }
}

public class A2Q6 {
    public static void main(String[] args) {
        Swapper s = new Swapper();

        s.swap(10, 20);

        s.swap(12.5, 45.7);
    }
}

