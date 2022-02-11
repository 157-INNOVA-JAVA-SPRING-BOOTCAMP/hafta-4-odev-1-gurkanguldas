package LiskovSubstitutionPrinciple.ShapeWrite;

import LiskovSubstitutionPrinciple.Shape.Point;

public class PointWrite implements IShapeWrite
{
	private Point point;
	
	public PointWrite(Point point) 
	{
		this.point = point;
	}

	@Override
	public void write() 
	{
		System.out.println(point.shapeName()+" Point Writed In File.");
	}
}
