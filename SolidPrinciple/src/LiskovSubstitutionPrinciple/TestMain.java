package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.Shape.IShape;
import LiskovSubstitutionPrinciple.Shape.Line;
import LiskovSubstitutionPrinciple.Shape.Polygon;
import LiskovSubstitutionPrinciple.ShapeCalculate.IShapeCalculate;
import LiskovSubstitutionPrinciple.ShapeCalculate.LineCalculate;
import LiskovSubstitutionPrinciple.ShapeCalculate.PolygonCalculate;
import LiskovSubstitutionPrinciple.ShapeDraw.IShapeDraw;
import LiskovSubstitutionPrinciple.ShapeDraw.LineDraw;
import LiskovSubstitutionPrinciple.ShapeDraw.PolygonDraw;
import LiskovSubstitutionPrinciple.ShapeWrite.IShapeWrite;
import LiskovSubstitutionPrinciple.ShapeWrite.LineWrite;
import LiskovSubstitutionPrinciple.ShapeWrite.PolygonWrite;

public class TestMain {
	
	private static IShape shape;					//creation process 
	private static IShapeCalculate shapeCalculate;  //calculation process 
	private static IShapeWrite shapeWrite;			//drawing process 
	private static IShapeDraw shapeDraw;			//writing process 
	
	public static void main(String[] args) 
	{
		
		shape = new Polygon("poly1");
		shapeCalculate = new PolygonCalculate((Polygon)shape);
		shapeDraw = new PolygonDraw((Polygon)shape);
		shapeWrite = new PolygonWrite((Polygon)shape);
		
		shapeMethods();
		
		shape = new Line("line1");
		shapeCalculate = new LineCalculate((Line)shape);
		shapeDraw = new LineDraw((Line)shape);
		shapeWrite = new LineWrite((Line)shape);
		
		shapeMethods();
		
	}
	
	public static void shapeMethods()
	{
		shapeCalculate.getArea();
		shapeCalculate.getDistance();
		shapeDraw.draw();
		shapeWrite.write();
	}
}
/** 
 * 1- Responsibilities are not specified by interfaces. It is not compatible 
 * with Interface Segregation
 */