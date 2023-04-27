
import java.util.Scanner;
public class UsingShapes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		int sides = scan.nextInt();
		System.out.print("What color? ");
		String color = scan.next();
		System.out.print("Is it filled? [y/n]: ");
		String filled = scan.next();
		
		Shape myShape = new Shape(sides, color, filled.equalsIgnoreCase("y") );
//		System.out.println(myShape);;
		displayShape(myShape);
		
		Rectangle myRectangle = new Rectangle(4, "blue", true, 5.0, 3.5);
//		System.out.println(myRectangle);
		displayShape(myRectangle);
	}
	
	public static void displayShape(Shape shapeObj) {
		System.out.println(shapeObj);
	}

}
