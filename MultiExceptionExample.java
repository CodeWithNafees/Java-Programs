public class MultiExceptionExample {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two command-line arguments.");
        }
    }
}
