class Tester
{

    void test(int n)
    {
        System.out.println(n + " is an Integer.");
    }

    void test(double n)
    {
        System.out.println(n + " is a Double.");
    }

    void test(char n)
    {
        System.out.println("'" + n + "' is a Character.");
    }
}

public class A2Q8
{
    public static void main(String[] args)
    {
        Tester t = new Tester();

        t.test(10);

        t.test(12.34);

        t.test('A');
    }
}
