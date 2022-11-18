import java.util.Scanner;

class deploy{

public static void main(String xx[]){

	
	int  a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the coefficients a,b,c\n");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
double des=(b*b)-(4*a*c);
double root1,root2;
if(a==0){System.out.println("The equation is not quadratic\n");}
else if(des>0){

root1=-b+Math.sqrt(des);
root2=-b+Math.sqrt(des);

     System.out.println("The roots are real and distinct\nRoot 1:"+root1+"\nroot 2:"+root2);
}
else if(des==0){
root1=root2=-b/(2*a);
System.out.println("The roots are real and equal\nRoot1:"+root1+"\nRoot2:"+root2);
}
else{
root1=-b/(2*a);
root2=Math.sqrt(Math.abs(des));

System.out.println("The roots are imaginary\nRoot1:"+root1+"+i"+root2+"\nRoot2:"+root1+"-i"+root2);
}
}
}