class Squarer {

    int square(int n) {
        return n * n;
    }

    float square(float n) {
        return n * n;
    }

    double square(double n) {
        return n * n;
    }

    int square(char n) {
        return n * n;
    }
}

public class A2Q7 {
    public static void main(String[] args) {
        Squarer s = new Squarer();

        int i = 5;
        float f = 3.5f;
        double d = 4.123;
        char c = 'A';

        System.out.println("Square of int " + i + " = " + s.square(i));
        System.out.println("Square of float " + f + " = " + s.square(f));
        System.out.println("Square of double " + d + " = " + s.square(d));
        System.out.println("Square of char '" + c + "' = " + s.square(c));
    }
}
