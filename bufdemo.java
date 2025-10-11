import java.io.*;
class bufdemo
{
   public static void main(String args[])
    {
       int rno;
       String nm;
       char grade;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter student details like rno,name,grede:");
       try
        {
           rno=Integer.parseInt(br.readLine());
	   nm=br.readLine();
	  grade= (char)br.read();
           System.out.println("Roll No="+rno);
           System.out.println("Name="+nm);
           System.out.println("Grade="+grade);
        }
        catch(IOException e){}
       
 
    }
}