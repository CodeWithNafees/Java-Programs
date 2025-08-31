 class command      // command line Argu
{
    public static void main(String arg[])
    {
        float a,b,c;

        a=Float.parseFloat(arg[0]);
        b=Float.parseFloat(arg[1]);

        c=a+b;
        System.out.println("Add:"+c);

    }
}
