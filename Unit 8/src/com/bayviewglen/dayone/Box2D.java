package com.bayviewglen.dayone;

public class Box2D {
	private double width; 
	private double length; 
	
	public Box2D(double width, double length) {
		this.width = width; 
		this.length = length; 
	}
	
	public double getArea() {
		return width * length; 
	}
	
	public double getPerimeter() {
		return 2*(width) + 2*(length); 
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public boolean isSquare() {
		return (length == width); 
	}
	
	
}
