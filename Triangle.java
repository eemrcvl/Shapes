
public class Triangle extends Shape{
	double base;
	double height;
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", color=" + color + "]";
	}
	@Override
	public double getArea() {
		if(base==0) {
			IllegalArgumentException a = new IllegalArgumentException("The base of a triangle cannot be zero");
			throw a;
		}
		if(height==0) 
		{
			throw new IllegalArgumentException("The height of a triangle cannot be zero");
		}
		return (base*height) / 2;
	}
	
	
}
