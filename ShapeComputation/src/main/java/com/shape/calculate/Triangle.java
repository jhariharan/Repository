package com.shape.calculate;

import com.shape.visitor.Visitor;

public class Triangle implements Shape {

	private double base;
	private double height;
	private double side;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
