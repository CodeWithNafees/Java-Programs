public class Array_Exception {
  public static void main(String[] args) {
    int a[] = new int[5];
    System.out.println("Hello World!");
    try {
      a[6] = 89;
      System.out.println(a[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println("Welcome to Java World!");
  }
}
