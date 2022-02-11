package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Shape.IShape;
import DependencyInversionPrinciple.ShapeCalculate.IShapeCalculate;

public class ShapeManager {

	/**
	 * Interfaces should be used to minimize the dependency between classes.
	 */
	
	private IShape shape;
	private IShapeCalculate shapeCalculate;
	
	public ShapeManager(IShape shape, IShapeCalculate shapeCalculate) 
	{
		this.shape = shape;
		this.shapeCalculate = shapeCalculate;
	}

	public IShape getShape() {
		return shape;
	}

	public void setShape(IShape shape) {
		this.shape = shape;
	}

	public IShapeCalculate getShapeCalculate() {
		return shapeCalculate;
	}

	public void setShapeCalculate(IShapeCalculate shapeCalculate) {
		this.shapeCalculate = shapeCalculate;
	}
	
	
	
}
