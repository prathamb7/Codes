import java.io.*;

public class Reverse {
public static void main(String[] args)throws IOException
{
 int org[]=new int[3];
	 int i;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader stdin= new BufferedReader(isr);
	System.out.println("Enter the numbers");
	for(i=0;i<2;i++)
	{
		org[i]=Integer.parseInt(stdin.readLine());
		}
	for(i=1;i>=0;i--)
	{
		System.out.println(org[i]);
	}
}


}
