class base
{
  int x=12;
}
class der extends base
{
   int x=34;
    void show()
    {
      System.out.println("x="+x);
       System.out.println("x="+super.x);
    }
}
class superdemo1
{
  public static void main(String args[])
   {
      der d=new der();
      d.show();
   }
}