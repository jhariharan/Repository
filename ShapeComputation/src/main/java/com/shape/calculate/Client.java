package com.shape.calculate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shape.visitor.AreaVisitor;
import com.shape.visitor.PerimeterVisitor;

public class Client {

	public static void main(String args[]) {

		int radius, length, breadth, height, side;

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		AreaVisitor areaVisitor = (AreaVisitor) context.getBean("areaVisitorBean");
		PerimeterVisitor perimeterVisitor = (PerimeterVisitor) context.getBean("perimeterVisitorBean");
		
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("Please enter your option:");
		Scanner scanner = new Scanner(System.in);
		try{
			int choice = scanner.nextInt();
			switch (choice){
			case 1:
				System.out.println("Enter Radius:");
				radius = scanner.nextInt();
				Circle circle = (Circle) context.getBean("circleBean");
				circle.setRadius(radius);
				circle.accept(areaVisitor);
				circle.accept(perimeterVisitor);
				System.out.println("Area" + areaVisitor.getArea());
				System.out.println("Perimeter" + perimeterVisitor.getPerimeter());
				break;
			case 2:
				System.out.println("Enter Length:");
				length = scanner.nextInt();
				System.out.println("Enter Breadth:");
				breadth = scanner.nextInt();
				Rectangle rectangle = (Rectangle) context.getBean("rectangleBean");
				rectangle.setBreadth(breadth);
				rectangle.setLength(length);
				rectangle.accept(areaVisitor);
				rectangle.accept(perimeterVisitor);
				System.out.println("Area" + areaVisitor.getArea());
				System.out.println("Perimeter" + perimeterVisitor.getPerimeter());
				break;
			case 3:
				System.out.println("Enter Base:");
				length = scanner.nextInt();
				System.out.println("Enter Height:");
				height = scanner.nextInt();
				System.out.println("Enter Side:");
				side = scanner.nextInt();
				Triangle triangle = (Triangle) context.getBean("triangleBean");
				triangle.setBase(length);
				triangle.setHeight(height);
				triangle.setSide(side);
				triangle.accept(areaVisitor);
				triangle.accept(perimeterVisitor);
				System.out.println("Area" + areaVisitor.getArea());
				System.out.println("Perimeter" + perimeterVisitor.getPerimeter());
				break;
			default:
				break;
			}
		} catch(Exception exception){
			System.out.println("Input is not valid...");
		}
		scanner.close();
	}
}
