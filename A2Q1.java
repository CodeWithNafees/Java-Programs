public class A2Q1
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the radius as a command line argument.");
            return;
        }

        double radius = Double.parseDouble(args[0]);

        double area = 3.14  * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
