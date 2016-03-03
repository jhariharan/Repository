package com.shape.calculate;

import com.shape.visitor.Visitor;

public class Circle implements Shape {

	private double radius;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
