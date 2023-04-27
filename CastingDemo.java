
public class CastingDemo {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object */
  public static void displayObject(Object object) {
	 /*if (object instanceof GeometricObject) {
		  System.out.println("The circle area is " +
		    ((GeometricObject)object).getArea());
	  }
	*/  
    /*if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle)object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle)object).getDiameter());
    }
    else if (object instanceof 
                  Rectangle) {
      System.out.println("The rectangle area is " +
        ((Rectangle)object).getArea());
    }
    */
    
    if (object instanceof Circle) {
        Circle c = (Circle) object;
    	System.out.println("The circle area is " + c.getArea());
        System.out.println("The circle diameter is " +c.getDiameter());
      }
      else if (object instanceof  Rectangle) {
        Rectangle r = (Rectangle)object;
    	  System.out.println("The rectangle area is " + r.getArea());
      }
  }
  
}
