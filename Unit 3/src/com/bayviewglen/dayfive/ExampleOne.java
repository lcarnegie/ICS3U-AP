package com.bayviewglen.dayfive;

public class ExampleOne {

	      public static void main(String[] args) {
	             int number = 3;
	             int x = 10;
	             System.out.println("1. " + x);
	             mystery(x);
	             System.out.println("4. " + x);      //Java arguments/parameters are passed a copy of what is in the box, so the change isn't actually happening
	             x = mystery2(x);                      //for object types, it copies the address, so it would change the actual object
	             //assigns what it returned to x                     //nothing changes in strings
	             System.out.println("5. " + x);
	             
	             //int result = cube(number);
	             //System.out.println("The result: "+ result);
	             


	      }
	    //all of our methods will be public stative for now
	      //public static returnType methodName(argumentList){...}
	             //public refers to it's visibility: the opposite of private
	                   //everyone can use it
	             //static: belongs to the class
	                   //for example: Math.random();
	      public static int cube(int x) {        //takes the int and returns it as an int
	             return (int)Math.pow(x, 3);            //this must be the same type as returnType
	      
	      }
	      
	      //void means we are not going to return anything
	      public static void mystery(int x) {
	             System.out.println("2. " + x);
	             x++;
	             System.out.println("3. " + x);

	      }
	      
	      public static int mystery2(int x) {
	             
	      return ++x;
	      }


}
