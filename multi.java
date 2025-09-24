class hii extends Thread
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
       System.out.println("Hi");
   }
  }
}

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
     System.out.println("Hello");
   }
  }
}

class multi
{
   public static void main(String arg[])
{
   hii o=new hii();
   hello s=new hello();
   o.start();
    try
     { 
        Thread.sleep(500);
     }
      catch(Exception e){}
   s.start();
}
}

  