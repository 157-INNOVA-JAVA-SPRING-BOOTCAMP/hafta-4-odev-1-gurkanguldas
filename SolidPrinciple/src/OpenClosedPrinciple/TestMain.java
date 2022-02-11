package OpenClosedPrinciple;

import OpenClosedPrinciple.Shapes.IShape;
import OpenClosedPrinciple.Shapes.Line;
import OpenClosedPrinciple.Shapes.Polygon;

public class TestMain 
{
	public static void main(String[] args) 
	{
		IShape shape = new Line();                            //creation process            
		
		ShapeCalculate shapeCalculate = new ShapeCalculate(); //calculation process
		ShapeDraw shapeDraw = new ShapeDraw();                //drawing process
		ShapeWrite shapeWrite = new ShapeWrite();             //writing process
		 
		shapeCalculate.getDistance(shape);
		shapeDraw.drawLine();
		shapeWrite.writeLine();
		
		IShape shape2 = new Polygon();                        //creation process
		
		shapeCalculate.getDistance(shape2);
		shapeDraw.drawPolygon();
		shapeWrite.writePolygon();
		
		
		/**
		 * New features can be added without changing the codes of the shapeCalculate class.
		 */
		
		
		/**
		 * 1- Polymorphism was partially used.
		 * 
		 * 2- Responsibilities are not specified by interfaces. It is not compatible 
		 * with Interface Segregation
		 * 
		 * 3- Everything is interdependent. It is not compatible with Dependency Inversion
		 */
	}
}
