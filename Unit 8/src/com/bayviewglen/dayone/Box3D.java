package com.bayviewglen.dayone;

//Box2D is the parent(Base class) object of Box3D
//Box3D is the child (Subclass) object of Box2D

public class Box3D extends Box2D{
	private double height; 
	public Box3D(double width, double length, double height) {
		super(width, length); //super is our parent object : you are a calling its constructors
		this.setHeight(height); 	//NOTE: If you are going to call the parent object's constructor, 
								//it MUST be done in the first line of the constructor
								//It cannot be used twice
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}	
	
	public double getSurfaceArea() {
		return 2 * super.getArea() + height * (getLength()+getWidth()) * 2; 
	}
	
	public double getVolume() {
		return super.getArea() * height; 
	}
	

}
