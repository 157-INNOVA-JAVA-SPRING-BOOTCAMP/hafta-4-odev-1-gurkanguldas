package LiskovSubstitutionPrinciple.ShapeWrite;

import LiskovSubstitutionPrinciple.Shape.Line;

public class LineWrite implements IShapeWrite
{
	private Line line;
	
	public LineWrite(Line line) 
	{
		this.line = line;
	}

	@Override
	public void write() 
	{
		System.out.println(line.shapeName()+" Line Writed In File.");
	}
}
