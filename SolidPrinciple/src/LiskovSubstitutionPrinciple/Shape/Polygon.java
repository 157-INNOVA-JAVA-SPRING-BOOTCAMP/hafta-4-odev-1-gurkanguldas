package LiskovSubstitutionPrinciple.Shape;

public class Polygon implements IShape
{
	private String name;
	public Polygon(String name) 
	{
		this.name = name;
		System.out.println(name+" Polygon Created.");
	}

	@Override
	public String shapeName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
