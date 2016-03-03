package com.shape.visitor;

import com.shape.calculate.Circle;
import com.shape.calculate.Rectangle;
import com.shape.calculate.Triangle;

public class AreaVisitor implements Visitor {

	private double area;

	public double getArea() {
		return area;
	}

	public void visit(Rectangle rectangle) {
		area = rectangle.getBreadth() * rectangle.getLength();

	}

	public void visit(Circle circle) {
		area = 3.14 * circle.getRadius() * circle.getRadius();

	}

	public void visit(Triangle triangle) {
		area = (triangle.getBase() * triangle.getHeight()) / 2;

	}

}
