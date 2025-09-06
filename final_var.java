class finaldemo {
  final int i=34; // This is final value assigned...
  void set()
  {
   // i=89; Can't able to change final i value...
    System.out.println(i);
  }

}
public class final_var{
  public static void main(String[] var0) {
      finaldemo o= new finaldemo();
     o.set();
}
}