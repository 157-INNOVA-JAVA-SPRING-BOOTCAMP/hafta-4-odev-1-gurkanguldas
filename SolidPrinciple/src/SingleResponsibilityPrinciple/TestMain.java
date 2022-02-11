package SingleResponsibilityPrinciple;

public class TestMain 
{
	public static void main(String[] args) 
	{
		Shape shape = new Shape();
		ShapeCalculate shapeCalculate = new ShapeCalculate();
		ShapeDraw shapeDraw = new ShapeDraw();
		ShapeWrite shapeWrite = new ShapeWrite();
		
		shape.createLine();                 //creation process
		shapeCalculate.getDistance("Line"); //calculation process
		shapeDraw.drawLine();               //drawing process
		shapeWrite.writeLine();             //writing process
		
		/**
		 * 1- The code needs to change when new features are added. It is not 
		 * compatible with Open Closed.
		 * 
		 * 2- Polymorphism is not used. It is not compatible with Liskov Substitution.
		 * 
		 * 3- Responsibilities are not specified by interfaces. It is not compatible 
		 * with Interface Segregation
		 * 
		 * 5- Everything is interdependent. It is not compatible with Dependency Inversion
		 */
	}
}
