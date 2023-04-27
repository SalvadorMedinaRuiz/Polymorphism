
public class Shape {
	private int sides;
	private String color;
	private boolean filled;
	
	public Shape() {
		/*
		sides = 0;
		color = "red";
		filled = true;
		*/
		this(0, "red", true);
	}
	
	public Shape(int theSides, String theColor, boolean ifFilled)
	{
		this.sides = theSides;
		this.color = theColor;
		this.filled = ifFilled;
	}
	
	public int getSides()
	{
		return this.sides;
	}
	
	public String getColor()
	{
		return this.color;
	}

	public boolean getFilled()
	{
		return this.filled;
	}
	
	public void setSides(int sides)
	{
		this.sides = sides;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public String toString()
	{
		String temp = "not filled";
		if (filled)
			temp = "filled";
		return "Shape object...\nsides " + sides + "\ncolor " + color + "\n" + temp;
	}
}
