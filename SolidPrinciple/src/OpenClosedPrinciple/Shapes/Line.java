package OpenClosedPrinciple.Shapes;

public class Line implements IShape
{
	public Line() 
	{
		System.out.println("Line Created.");
	}
	@Override
	public void getArea() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void getDistance() 
	{
		System.out.println("Line Distance Calculated.");
	}
}
