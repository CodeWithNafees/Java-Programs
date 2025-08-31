class Rect
{
    int length;
    int height;

    Rect(int i, int b)
    {
        length = i;
        height = b;
    }

    int area()
    {
        return length * height;
    }
}

public class A2Q3
{
    public static void main(String[] args)
    {
        Rect r = new Rect(10,5);
        int area = r.area();

        System.out.println("Area of Rectangle = "+area);
    }
}
