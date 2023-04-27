
public class DynamicBindingDemo {
  public static void main(String[] args) {
	Object o = new GraduateStudent(); // implicit casting. 
	
	Object o1 = new Object();
/*	
	if (o instanceof GraduateStudent) {
	  System.out.println("Never got here");
	 GraduateStudent gs = (GraduateStudent)o1; // explicit casting, gs will refer to o1 which was referred to as an object. have to do it this way because both classes are sub and super
	}
*/	
	Person p = new Person();
	o = p; //o is now p, so object is now person
	
    m(o);
    m(o1);
    m(new Student());
    m(new Person());
    m(new Object());
    
  }

  public static void m(Object x) { //upcasting is when you treat Student() as an object
    System.out.println(x.toString()); //dynamically indeifities which toString method you are reffering to based pn how it was initiated (aka as a student) not how it was declared (aka object)
  }
}

class GraduateStudent extends Student {
}

class Student extends Person {
  public String toString() {
    return "Student";
  }
}

class Person extends Object {
  public String toString() {
    return "Person";
  }
}
