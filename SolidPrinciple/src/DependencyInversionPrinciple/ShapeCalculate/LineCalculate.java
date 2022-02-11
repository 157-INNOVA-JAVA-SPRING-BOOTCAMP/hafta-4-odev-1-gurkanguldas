package DependencyInversionPrinciple.ShapeCalculate;

import LiskovSubstitutionPrinciple.Shape.Line;

public class LineCalculate implements IShapeCalculate{

	private Line line;
	
	public LineCalculate(Line line) 
	{
		this.line = line;
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
		System.out.println(line.shapeName()+" Line Distance Calculated.");
	}
}

