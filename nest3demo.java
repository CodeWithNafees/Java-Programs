import java.io.*;
interface ex
{
   void show();
}
class nest3demo
{
   public static void main(String args[])
    {
    ex x=new ex()
     {
        public void show()
         {
            System.out.println("Anonymus inner class methid called...");
          }
      };
      x.show();
      
      
    }
}