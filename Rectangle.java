
public class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + "]";
	}

	@Override
	public double getArea(){
		if(length==0 || width==0) 
		{
			throw new IllegalArgumentException("The sides of a rectangle cannot be zero");
		}
		return length*width;
	}
}
