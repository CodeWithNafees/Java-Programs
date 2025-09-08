public class Number_Format_Exception {
  public static void main(String[] args) {
    String s = "Nafees";
    System.out.println("Hello World!");
    try {
      int a = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("The Exception handling here!......");
    }
    System.out.println("Wakeup to reality, Nothing ever goes as planned in this World!....");
  }
}
