package Package_Java;

class Shape{
	public void display()
	{
		System.out.println("This is shape method.");
	}
}
class rectangle extends Shape{
	public void show()
	{
		System.out.println("This is Rectangle Shape. ");
	}
}
class Square extends Shape{
	public void squaress()
	{
		System.out.println("This is Square Shape.");
	}
}
public class Hierachical_Inheritance {

	public static void main(String[] args) {

		rectangle obj1 = new rectangle();
		Square obj2 = new Square();
		obj1.display();
		obj1.show();
		obj2.squaress();
	}
}
//OUTPUT

/*
  This is shape method.
  This is Rectangle Shape.
  This is Square Shape.
*/
