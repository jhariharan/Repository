package com.shape.calculate;

import com.shape.visitor.Visitor;

public class Rectangle implements Shape {

	private double length;
	private double breadth;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}
