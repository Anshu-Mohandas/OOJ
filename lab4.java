import java.util.Scanner;
import java.lang.Math;
abstract class Shape
{
	Shape(){}
	int h,b;
	abstract void printArea();
	}
class Rectangle extends Shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and width of rectangle");
			h=s.nextInt();
			b=s.nextInt();
			System.out.println("Area of Rectangle is "+b*h);
			}
	Rectangle(){}
}


class Triangle extends Shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and base of rectangle");
			h=s.nextInt();
			b=s.nextInt();
			System.out.println("Area of Trianle is "+0.5*b*h);
			}
		Triangle(){}
}

class Circle extends Shape
{
	Scanner s=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter radius of Circle");
			h=s.nextInt();
			System.out.println("Area of Circle is "+(Math.PI*(h*h)));
			}
		Circle(){}
}


class Lab4
{
public static void main(String xx[])
{
	Scanner s=new Scanner(System.in);
        System.out.println("\n\nSelect shape-->1.Rectangle  2. Triangle  3.Circle");
	int ch=s.nextInt();
	switch(ch)
	{
	case 1:	Rectangle r=new Rectangle();
	         r.printArea();
		break;
	case 2:Triangle t=new Triangle();
		t.printArea();break;
	case 3:Circle c=new Circle();
		c.printArea();break;
	default:System.out.println("Invalid input");
}
}
}
