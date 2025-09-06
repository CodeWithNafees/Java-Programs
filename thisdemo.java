class thisdemo
{
   int a,b;
    void set(int a,int b)
    {
       this.a=a;
       this.b=b;
    }
    void add()
    {
      System.out.println("add="+(a+b));
    }
    public static void main(String args[])
     {
        thisdemo x=new thisdemo();
         x.set(12,3);
	x.add();
    }
}
  