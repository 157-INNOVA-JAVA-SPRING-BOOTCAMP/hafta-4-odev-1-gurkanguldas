package NoPrincipleUsed;

public class Shape {

	public void createPoint()
	{
		System.out.println("Point Created.");
	}
	public void createLine()
	{
		System.out.println("Line Created .");
	}
	public void createPolygon()
	{
		System.out.println("Polygon Created .");
	}
	
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
	
	public void drawPoint()
	{
		System.out.println("Point Drawed.");
	}
	public void drawLine()
	{
		System.out.println("Line Drawed.");
	}
	public void drawPolygon()
	{
		System.out.println("Polygon Drawed.");
	}
	
	public void writePoint()
	{
		System.out.println("Point Writed In File.");
	}
	public void writeLine()
	{
		System.out.println("Line Writed In File..");
	}
	public void writePolygon()
	{
		System.out.println("Polygon Writed In File..");
	}
}
