package OpenClosedPrinciple.Shapes;

public class Polygon implements IShape
{
	public Polygon() 
	{
		System.out.println("Polygon Created.");
	}
	@Override
	public void getArea() 
	{
		System.out.println("Polygon Area Calculated");
	}

	@Override
	public void getDistance() 
	{
		System.out.println("Polygon Distance Calculated");
	}
}
