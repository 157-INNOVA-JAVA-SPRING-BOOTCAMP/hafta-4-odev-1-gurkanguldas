package InterfaceSegregationPrinciple.ShapeCalculate;

import InterfaceSegregationPrinciple.Shape.IShape;

public class PolygonCalculate implements IArea,IDistance{

	private IShape shape;
	
	public PolygonCalculate(IShape shape) 
	{
		this.shape = shape;
	}
	@Override
	public void getArea() 
	{
		System.out.println(shape.shapeName()+" Polygon Area Calculated.");
	}

	@Override
	public void getDistance() 
	{
		System.out.println(shape.shapeName()+" Polygon Distance Calculated.");
	}
}
