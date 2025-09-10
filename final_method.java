class a 
{
  final void get()
  {
    System.out.println("Hello world!");
  }

}

class b extends a
 { 
  // Show Error because Final keyWord used in super class....
  // void get()

  void show()
  {
    System.out.println("New World!.....");
  }
}



public class final_method {
  public static void main(String[] args) {
    b o = new b();
    o.show();
    o.get();
  }
}
