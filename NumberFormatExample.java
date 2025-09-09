
public class NumberFormatExample {
    public static void main(String[] args) {
        String str = "123a";

        try {
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + str + "' is not a valid integer.");
        }
    }
}
