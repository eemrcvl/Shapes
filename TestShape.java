import java.util.Scanner;
public class TestShape {


	public static void main(String[] args) {
		
		
		int n=0;
		boolean isTrue=true;
		Scanner s= new Scanner(System.in);
		while(isTrue) {
		System.out.println("Which shape do you want to create?\n1.Rectangle\n2.Triangle\n3.Done");
		n=s.nextInt();
		switch(n) 
		{
		case 1:
			String colorRec=null;
			double lengthRec=0,widthRec=0;
			System.out.println("Enter the color of the rectangle");
			colorRec=s.next();	
			System.out.println("Enter the first side of the rectangle");
			lengthRec=s.nextDouble();
			System.out.println("Enter the second side of the rectangle");
			widthRec=s.nextDouble();
			try {
			Rectangle r= new Rectangle(colorRec,lengthRec,widthRec);
			System.out.println(r);
			System.out.println("The area of rectangle is: " + r.getArea());
			}catch(IllegalArgumentException e) 
			{
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			String colorTri=null;
			double base=0,height=0;
			System.out.println("Enter the color of the triangle");
			colorTri=s.next();
			System.out.println("Enter the base of triangle");
			base=s.nextDouble();
			System.out.println("Enter the height of triangle");
			height=s.nextDouble();
			try {
			Triangle t= new Triangle(colorTri,base,height);
			System.out.println(t);
			System.out.println("The area of triangle is: " + t.getArea());
			}catch(IllegalArgumentException e) 
			{
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.exit(0);
			break;
		}
		
		}
		
		s.close();
	}
}
