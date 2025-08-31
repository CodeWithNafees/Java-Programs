class opr             // default constructor
{
    int a,b,c;

    opr()
    {
        a = 12;
        b = 4;

        c = a + b;
        System.out.println("Add:" + c);
    }
}

class constructor
{
    public static void main(String[] args)
    {
        opr o=new opr();
    }
}
