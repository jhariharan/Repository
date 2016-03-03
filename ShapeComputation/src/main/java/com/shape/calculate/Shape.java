package com.shape.calculate;

import com.shape.visitor.Visitor;

public interface Shape {

	public void accept(Visitor visitor);

}
