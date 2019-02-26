package com.bayviewglen.dayone;

public class PlaceWhereCatsAndDogsPlay {

	public static void main(String[] args) {
		//Animal thing = new Animal(); cannot instantiate an abstract class
		
		/*
		Dog puppy = new Dog("Coco"); 
		Cat strayCat = new Cat("Scrawny Cat"); 
		puppy.eat(6);
		strayCat.eat(1); 
		
		puppy.play();
		strayCat.play(); 
		
		puppy.makeNoise();
		strayCat.makeNoise(); 
		*/
		
		//POLYMORPHISM -> you can store one subobject as another subobject when they are both children of the parent class
		
		Animal polly = new Cat("Happy Cat"); 
		polly.eat(5); 
		polly.play(); //dynamic binding -> object doesn't know which method of the object to call until this line runs
		
		polly = new Dog("Bigger than the cat"); 
		polly.play();
		

	}

}
