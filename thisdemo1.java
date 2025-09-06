class thisdemo1
{
   thisdemo1()
    {
     this(12,3,4);
       System.out.println("default constructor is called...");
    }
    thisdemo1(int a,int b)
    {
      this();
      System.out.println("add="+(a+b));
    }
    thisdemo1(int a,int b,int c)
    {
     
      System.out.println("add="+(a+b+c));
    }
    public static void main(String args[])
     {
        //thisdemo1 x=new thisdemo1();
       thisdemo1 y=new thisdemo1(56,7);
 	//thisdemo1 z=new thisdemo1(5,5,5);
    }
}
  