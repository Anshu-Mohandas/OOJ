package SEE;
import CIE.Student;
import java.util.*;

public class External extends Student
{
	Scanner scan=new Scanner(System.in);
	public int n;
	public double earr[];
	public void getdata()
	{
	
		earr = new double[5];
		System.out.println("name: ");
		name = scan.next();
		System.out.println("usn: ");
		usn = scan.next();
		System.out.println("sem: ");
		sem = scan.nextInt();
		System.out.println("SEE marks: ");
		
	}
	public void setdata()
	{
		for(int i=0;i<5;i++)
		{
			earr[i] = scan.nextDouble();
			earr[i] = (double)earr[i]/2;
		}
	}
}

		