package NoPrincipleUsed;

public class TestMain 
{
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		shape.createPolygon();     //creation process
		shape.getArea("Polygon");  //calculation process
		shape.drawPolygon();       //drawing process
		shape.writePolygon();      //writing process
		
		/**
		 * 1- There is more than one responsibility. It is not compatible with 
		 * Single Responsibility.
		 * 
		 * 2- The code needs to change when new features are added. It is not 
		 * compatible with Open Closed.
		 * 
		 * 3- Polymorphism is not used. It is not compatible with Liskov Substitution.
		 * 
		 * 4- Responsibilities are not specified by interfaces. It is not compatible 
		 * with Interface Segregation
		 * 
		 * 5- Everything is interdependent. It is not compatible with Dependency Inversion
		 */
	}
}



