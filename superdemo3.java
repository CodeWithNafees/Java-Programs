class base
{
  int a;
  base(int x)
   {
     a=x;
   }
}
class der extends base
{
   int b;
   der(int x,int y)
    {
    super(x);
      b=y;
    }
   void add()
    {
       System.out.println("add="+(a+b));
    }
}
class superdemo3
{
  public static void main(String args[])
   {
      der d=new der(14,3);
	d.add();
   }
}