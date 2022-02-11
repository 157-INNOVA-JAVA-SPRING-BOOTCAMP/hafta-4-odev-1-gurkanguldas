package DependencyInversionPrinciple.ShapeCalculate;

import LiskovSubstitutionPrinciple.Shape.Polygon;

public class PolygonCalculate implements IShapeCalculate{

	private Polygon polygon;
	
	public PolygonCalculate(Polygon polygon) 
	{
		this.polygon = polygon;
	}
	@Override
	public void getArea() 
	{
		System.out.println(polygon.shapeName()+" Polygon Area Calculated.");
	}

	@Override
	public void getDistance() 
	{
		System.out.println(polygon.shapeName()+" Polygon Distance Calculated.");
	}
}
