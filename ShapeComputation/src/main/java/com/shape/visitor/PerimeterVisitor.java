package com.shape.visitor;

import com.shape.calculate.Circle;
import com.shape.calculate.Rectangle;
import com.shape.calculate.Triangle;

public class PerimeterVisitor implements Visitor {
	private double perimeter;

	public double getPerimeter() {
		return perimeter;
	}

	public void visit(Rectangle rectangle) {
		perimeter = 2 * (rectangle.getBreadth() + rectangle.getLength());

	}

	public void visit(Circle circle) {
		perimeter = 2 * 3.14 * circle.getRadius();

	}

	public void visit(Triangle triangle) {
		perimeter = triangle.getBase() + (triangle.getSide() * 2);

	}

}
