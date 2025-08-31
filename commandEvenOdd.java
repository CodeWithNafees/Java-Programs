 class commandEvenOdd      // command line Argu
{
    public static void main(String arg[])
    {
       int a;
	a=Integer.parseInt(arg[0]);
	
	if(a % 2 == 0)
	{
	System.out.println("The Even Number!");
	}
	else
	{
	System.out.println("The Odd Number!");
	}
    }
}