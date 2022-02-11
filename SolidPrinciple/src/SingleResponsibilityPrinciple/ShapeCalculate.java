package SingleResponsibilityPrinciple;

public class ShapeCalculate 
{
	public void getArea(String shp)
	{
		if(shp.equals("Polygon"))
		{
			System.out.println("Polygon Area Calculated.");
		}
		else
		{
			System.out.println("Error Of Calculate.");
		}
	}
	public void getDistance(String shp)
	{
		if(shp.equals("Polygon"))
		{
			System.out.println("Polygon Distance Calculated.");
		}
		else if(shp.equals("Line"))
		{
			System.out.println("Line Distance Calculated.");
		}
		else
		{
			System.out.println("Error Of Calculate.");
		}	
	}
}
