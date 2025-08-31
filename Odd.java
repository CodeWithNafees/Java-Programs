class count1
{
    void print()
    {
        for (int i = 1; i <= 50 ; i+=2)
        {
            System.out.println(i);
        }
    }
}


public class Odd
{
    public static void main(String[] args)
    {
        count1 a = new count1();
        a.print();
    }
}

