package com.shape.visitor;

import com.shape.calculate.Circle;
import com.shape.calculate.Rectangle;
import com.shape.calculate.Triangle;

public interface Visitor {

	public void visit(Rectangle rectangle);

	public void visit(Circle circle);

	public void visit(Triangle triangle);

}
