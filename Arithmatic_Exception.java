public class Arithmatic_Exception {
  public static void main(String[] args) {
    int a = 34, b = 0, c;
    System.out.println("Hello World");

    try {
      c = a / b;
      System.out.println("div ="+ c);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("Welcome to Java World!");
  }
}
