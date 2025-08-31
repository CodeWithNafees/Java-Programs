class Part {

    double length;
    double breadth;
    double area;

    Part(double l, double b) {
        length = l;
        breadth = b;
        area = length * breadth; // calculate area in constructor
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}

public class A2Q5 {
    public static void main(String[] args) {

        Part p1 = new Part(10, 5);

        p1.display();
    }
}