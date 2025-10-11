import java.io.*;
class out
{
   void show()
    {
       System.out.println("out class method is called...");
     }
    class in
     {
        void disp()
        {
       System.out.println("in class method is called...");
       }
    }
}
class nest1demo
{
   public static void main(String args[])
    {
      out t=new out();
      t.show();
      out.in i=t.new in();
        i.disp();
    }
}