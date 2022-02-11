package InterfaceSegregationPrinciple.Shape;

public class Point implements IShape
{
	private String name;
	public Point(String name) 
	{
		this.name = name;
		System.out.println(name+" Point Created.");
	}

	@Override
	public String shapeName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
