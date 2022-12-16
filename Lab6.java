import java.util.Scanner;
class patient 
{
	int ptid,ptage;
	String ptname;
	String doc;
	Scanner s=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter patient ID, Name, Age and Doctor name ");
		ptid=s.nextInt();
		ptname=s.next();
		ptage=s.nextInt();
		doc=s.nextLine();
	}
	void display()
	{
		System.out.println("Patient ID:"+ptid+"\npatient Name:"+ptname+"\nAge:"+ptage+"\nDoctor Name:"+doc);
	}
}

class main
{
public static void main(String xx[])
{
	int n,f=0;
	String d;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of n");
	n=s.nextInt();
	patient p[]=new patient[n];
	for(int i=0;i<n;i++)
	{
		p[i]=new patient();
		p[i].accept();
		System.out.println("Paient "+(i+1)+" details are accepted ");
	}
	System.out.println("Enter Patient ID ");
	int pid=s.nextInt();
	for(int i=0;i<n;i++)
	{
		if(p[i].ptid==pid)
		{
		p[i].display();
		f=1;
		}
	}
	if(f==0)
	System.out.println("No patient found ");
	f=0;
	System.out.println("Enter Doctor name ");
	d=s.nextLine();
	for(int i=0;i<n;i++)
	{
		if(p[i].doc==d)
		{
			p[i].display();
			f=1;
		}
	}
	if(f==0)
	System.out.println("There is no Doctor by name "+d);

}
}
		