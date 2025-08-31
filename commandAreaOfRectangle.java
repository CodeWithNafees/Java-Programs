class rect
{
	int length;
	int height;

	rect(int i, int b)
	{
	   length = i;
	   height = b;
	}
	
	int area()
	{
	return length * height;
	}
}




public class commandAreaOfRectangle
{
    public static void main(String[] args)
    {
 	rect r = new rect(10,5);
	int area = r.area();      
	System.out.print("Area of Rectangle = "+area);
    }
}