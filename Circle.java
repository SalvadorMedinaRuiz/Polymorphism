
public class Circle extends Shape { //circle is the subclass of shape

	private double radius;

	public Circle() {	
		radius = 0;
	}

	public Circle(double radius) {	
		this.radius = radius;
	}

	public Circle(int sides, String color, boolean filled, double radius) {
		super(sides, color, filled);
		this.radius = radius;

	}

	public void setRadius (double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/* Print the circle info */
	public void printCircle() {
		System.out.println("The radius is " + radius);
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nRadius = " + radius;

	}
	/*
	public boolean equals(Object otherObject) { //implicit. upcasts the circle to an object type.
		if (otherObject == null)
	        return false;
	    else if (getClass( ) != otherObject.getClass( )) 
	        return false;
	    else
	    {
	    	Circle circleObject = (Circle)otherObject; //explicity. downcasts the otherobject (which is an object) to a circle class type
	    	return (circleObject.radius - this.radius) < 0.01
	    }
	}
	*/

}
