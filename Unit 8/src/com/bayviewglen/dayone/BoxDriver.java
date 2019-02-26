package com.bayviewglen.dayone;

public class BoxDriver {
	
	public static void main(String args[]) {
		Box2D box1 = new Box2D(3, 2);
		
		System.out.println("Area: " + box1.getArea());
		System.out.println("Perimeter: " + box1.getPerimeter());
		System.out.println("Square Box? : " + box1.isSquare());
		
		Box3D box2 = new Box3D(5,5,6); 
		System.out.println("Area: " + box2.getSurfaceArea());
		System.out.println("Perimeter: " + box2.getVolume());

	}

}
