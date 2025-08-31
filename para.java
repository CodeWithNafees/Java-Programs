class opr1              // para
{
    int a,b,c;

    opr1(int x,int y)
    {
        a = x;
        b = y;

        c = a + b;
        System.out.println("Add:" + c);
    }
}

class para
{
    public static void main(String[] args)
    {
        opr1 o=new opr1(12,7);
    }
}

