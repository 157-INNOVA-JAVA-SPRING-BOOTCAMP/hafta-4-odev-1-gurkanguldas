package LiskovSubstitutionPrinciple.ShapeDraw;

import LiskovSubstitutionPrinciple.Shape.Line;

public class LineDraw implements IShapeDraw {

	private Line line;
	
	public LineDraw(Line line) 
	{
		this.line = line;
	}
	@Override
	public void draw() 
	{
		System.out.println(line.shapeName()+" Line Drawed.");
		
	}

}
