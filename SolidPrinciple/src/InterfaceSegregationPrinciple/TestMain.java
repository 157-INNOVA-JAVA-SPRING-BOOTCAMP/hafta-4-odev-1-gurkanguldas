package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.Shape.IShape;
import InterfaceSegregationPrinciple.Shape.Polygon;
import InterfaceSegregationPrinciple.ShapeCalculate.LineCalculate;
import InterfaceSegregationPrinciple.ShapeCalculate.PointCalculate;
import InterfaceSegregationPrinciple.ShapeCalculate.PolygonCalculate;

public class TestMain {
	
	
	public static void main(String[] args) 
	{
		IShape shape = new Polygon("poly1");
		
		PolygonCalculate polygonCalculate = new PolygonCalculate(shape);
		polygonCalculate.getArea();
		polygonCalculate.getDistance();
		
		LineCalculate lineCalculate = new LineCalculate(shape);
		lineCalculate.getDistance();
		
		PointCalculate pointCalculate = new PointCalculate(shape);
		// Empty
	}
}