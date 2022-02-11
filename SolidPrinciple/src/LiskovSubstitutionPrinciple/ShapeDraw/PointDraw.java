package LiskovSubstitutionPrinciple.ShapeDraw;

import LiskovSubstitutionPrinciple.Shape.Point;

public class PointDraw implements IShapeDraw {

	private Point point;
	
	public PointDraw(Point point) 
	{
		this.point = point;
	}
	@Override
	public void draw() 
	{
		System.out.println(point.shapeName()+" Point Drawed.");
		
	}

}
