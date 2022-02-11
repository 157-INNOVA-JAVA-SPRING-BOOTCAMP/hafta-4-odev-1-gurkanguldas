package InterfaceSegregationPrinciple.ShapeCalculate;

import InterfaceSegregationPrinciple.Shape.IShape;

public class LineCalculate implements IDistance{

	private IShape shape;
	
	public LineCalculate(IShape shape) 
	{
		this.shape = shape;
	}

	@Override
	public void getDistance() 
	{
		System.out.println(shape.shapeName()+" Line Distance Calculated.");
	}
	
}

