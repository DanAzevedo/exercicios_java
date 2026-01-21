package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;				
	}
	
	public double setWidth() {
		return width;
	}
	
	public void getWidth(double width) {
		this.width = width;
	}
	
	public double setHeight() {
		return height;
	}
	
	public void getHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
