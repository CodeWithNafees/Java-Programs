public class Null_pointer_Exception {
  public static void main(String[] args) {
    String s = null;
    System.out.println("Hello World");
    try {
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Welcome to Java World!");
  } 
}
