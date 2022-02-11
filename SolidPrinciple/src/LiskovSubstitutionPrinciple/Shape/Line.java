package LiskovSubstitutionPrinciple.Shape;

public class Line implements IShape
{
	private String name;
	public Line(String name) 
	{
		this.name = name;
		System.out.println(name+" Line Created.");
	}

	@Override
	public String shapeName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
