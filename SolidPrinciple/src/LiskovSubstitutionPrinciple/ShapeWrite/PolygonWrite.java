package LiskovSubstitutionPrinciple.ShapeWrite;

import LiskovSubstitutionPrinciple.Shape.Polygon;

public class PolygonWrite implements IShapeWrite
{
	private Polygon polygon;
	
	public PolygonWrite(Polygon polygon) 
	{
		this.polygon = polygon;
	}

	@Override
	public void write() 
	{
		System.out.println(polygon.shapeName()+" Polygon Writed In File.");
	}
}
