import java.util.Scanner;

public class Main {

	
	public static void main(String args[])
	{
		
		Config ob_shape = new Config();
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Please enter 1 for Circle, 2 for Square, 3 for Rectangle, 4 for triangle");
		
		int input = ob.nextInt();
		
		if(input==1)
		{
			
			System.out.println("Enter the radius for the Circle:");
			double r = ob.nextDouble();
			ob_shape.setSide(r);
			
			ob_shape.draw("Circle");
			
			System.out.println("The area is: "+3.14*(ob_shape.Area()));
		}
		
		else if(input==2)
		{
			System.out.println("Enter the side of the square: ");
			double side = ob.nextDouble();
			ob_shape.setSide(side);
			ob_shape.draw("Square");
			System.out.println("The area is: "+ob_shape.Area());
		}
		else if(input==3)
		{
			System.out.println("Enter the length and breadth of the rectangle: ");
			double length = ob.nextDouble();
			double breadth = ob.nextDouble();
			ob_shape.setSide(length);
			ob_shape.setSide2(breadth);
			ob_shape.draw("Rectangle");
			System.out.println("The area is: "+ob_shape.Area());
			
		}
		else if(input == 4)
		{
			System.out.println("Enter the base and height of triangle: ");
			double base = ob.nextDouble();
			double height = ob.nextDouble();
			ob_shape.setSide(base);
			ob_shape.setSide2(height);
			ob_shape.draw("Triangle");
			System.out.println("The area is: "+ob_shape.Area());
		}
		
	}
	
	
	
}


class Config implements Shape
{

	double side;
	double side2;
	
	String shape;
	

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setSide2(double side)
	{
		this.side2=side;
	}

	public void draw(String shapes) {
		this.shape = shapes;
		System.out.println("Drawing the "+shapes+" ......");
		
	}


	public double Area() {
		// TODO Auto-generated method stub
		
		double area = 0;
		
		if(shape == "Rectangle")
		{
			area = side*side2;
			
		
		}
		
		else if(shape == "Triangle")
		{
			area = 0.5*(side*side2);
		}
		else
		{
		area = side*side;
		}
		return area;
		
	}
	
}