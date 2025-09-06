class base
{
  int x=12;
  void show()
   {
      System.out.println("base class method is called");
   }
}
class der extends base
{
   int x=34;
    void show()
    {
      
      System.out.println("x="+x);
       System.out.println("x="+super.x);
      super.show();
    }
}
class superdemo2
{
  public static void main(String args[])
   {
      der d=new der();
      d.show();
   }
}