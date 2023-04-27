
public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle()
	{
		super();
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width)
	{
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle(int sides, String color, boolean filled, double length, double width)
	{
		super(sides, color, filled);
		this.length = length;
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}

	  /** Return area */
	  public double getArea() {
	    return width * length;
	  }

	  /** Return perimeter */
	  public double getPerimeter() {
	    return 2 * (width + length);
	  }
	
	public String toString()
	{
		String temp = "not filled";
		if (getFilled())
			temp = "filled";
		return "Rectangle pbject...\nSides " + getSides() + "\nColor " + getColor() + "\n" + temp +
				"\nLength " + length + "\nWidth " + width;
				
	}
}
