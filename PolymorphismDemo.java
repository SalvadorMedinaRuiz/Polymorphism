
public class PolymorphismDemo {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
	  Shape geo = new Shape();
	  displayObject(geo);
	  
	  Circle circle = new Circle (1, "red", false, 3);
	  displayObject(circle);
	  
	  Rectangle rectangle = new Rectangle (4, "black", true, 2, 5);
      displayObject(rectangle);
    
    
  }

  /** Display geometric object properties */
  public static void displayObject(Shape object) { //object can either be circle, rectangle, etc
    System.out.println("Color is " + object.getColor()); //there is no getColor() in Circle class, but since circle is a subclass of shape, you can refer to getColor() from Shape class.
    // System.out.println("Color is " + object.getRadius()); //there is no getRadius in Shape class. only use getRadius for the circle class.
   if (object instanceof Circle) 
    ((Circle)object).printCircle();
    
  }
}
