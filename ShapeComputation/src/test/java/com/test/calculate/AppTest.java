package com.test.calculate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shape.calculate.Circle;
import com.shape.visitor.AreaVisitor;
import com.shape.visitor.PerimeterVisitor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	AreaVisitor areaVisitor = (AreaVisitor) context.getBean("areaVisitorBean");
	PerimeterVisitor perimeterVisitor = (PerimeterVisitor) context.getBean("perimeterVisitorBean");

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testCircleArea() {
		Circle circle = (Circle) context.getBean("circleBean");
		circle.setRadius(5);
		circle.accept(areaVisitor);
		assertEquals(3.14 * 25, areaVisitor.getArea());
	}

	public void testCirclePerimeter() {
		Circle circle = (Circle) context.getBean("circleBean");
		circle.setRadius(5);
		circle.accept(perimeterVisitor);
		assertEquals(25, perimeterVisitor.getPerimeter());
	}
}
