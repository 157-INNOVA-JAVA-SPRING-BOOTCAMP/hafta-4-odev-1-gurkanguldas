package InterfaceSegregationPrinciple.ShapeCalculate;

import InterfaceSegregationPrinciple.Shape.IShape;

public class PointCalculate{

	private IShape shape;
	
	public PointCalculate(IShape shape) 
	{
		this.shape = shape;
	}
}