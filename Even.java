class count
{
    void print()
    {
        for (int i = 0; i <= 50 ; i+=2)
        {
            System.out.println(i);
        }
    }
}


public class Even
{
    public static void main(String[] args)
    {
        count a = new count();
        a.print();
    }
}
