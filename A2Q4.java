class Students
{
    String name;
    int age;
    String course;

    void setData(String n, int a, String c)
    {
        name = n;
        age = a;
        course = c;
    }

    void showData()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class A2Q4
{
    public static void main(String[] args)
    {
        Students s1 = new Students();

        s1.setData("Nafees", 22, "MCA");

        s1.showData();
    }
}