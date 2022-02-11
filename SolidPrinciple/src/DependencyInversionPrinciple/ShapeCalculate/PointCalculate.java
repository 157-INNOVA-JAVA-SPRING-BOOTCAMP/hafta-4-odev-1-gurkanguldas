package DependencyInversionPrinciple.ShapeCalculate;

import LiskovSubstitutionPrinciple.Shape.Point;

public class PointCalculate implements IShapeCalculate{

	private Point point;
	
	public PointCalculate(Point point) 
	{
		this.point = point;
	}
	@Override
	public void getArea() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void getDistance() 
	{
		// TODO Auto-generated method stub
	}
}
