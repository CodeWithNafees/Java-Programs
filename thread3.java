class hello extends Thread
{
  public void run()
  {
   for(int i=1;i<=5;i++)
  {
    
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e){}
      System.out.println("hello ");
   }
  }
}
class hi extends Thread
{
  public void run()
  {
   for(int i=1;i<=5;i++)
  {
    
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e){}
      System.out.println("hi ");
   }
  }
}


class thread3 {
  public static void main(String[] args) {
  
  hello h=new hello();
  hi h1=new hi();
   h.start();
   h1.start();
  }
}
