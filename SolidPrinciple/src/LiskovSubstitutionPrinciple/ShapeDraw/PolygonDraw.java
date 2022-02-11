package LiskovSubstitutionPrinciple.ShapeDraw;

import LiskovSubstitutionPrinciple.Shape.Polygon;

public class PolygonDraw implements IShapeDraw {

	private Polygon polygon;
	
	public PolygonDraw(Polygon polygon) 
	{
		this.polygon = polygon;
	}
	@Override
	public void draw() 
	{
		System.out.println(polygon.shapeName()+" Polygon Drawed.");
		
	}

}
