/**
 * 
 */
package com.tutorials;

/**
 * @author AartiC
 * This tutorial is to teach simple array creation and different ways to access it
 * For beginners, an array is a container object that holds a fixed number of values of a single type
 */
public class SimpleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// Creating an numbers arrays with 5 elements.
		// Simple way of initializing array. This sets their values at compile time
		int[] numbers = { 10, 20, 30, 40, 50 };
		
		// One way of looping		
		System.out.println("Numbers are");
		for(int i = 0; i < 5; i++)
			System.out.println(numbers[i]);	
		
		// Printing reversed array		
		System.out.println("Reversed order numbers are");
		for(int i = numbers.length-1; i > 0; i--)
			System.out.println(numbers[i]);	
		
		// Another way of creating arrays. 		
		String[] birds = new String[3];
		birds[0] = "Sparrow";
		birds[1] = "Nightingale";
		birds[2] = "Parrots";
  		
		// Trying to assign values to array elements which don't exist would raise a java.lang.ArrayIndexOutOfBoundsException
		
		//birds[3] = "Raise exception"; 
		System.out.println("Birds in the array are:");
		
		// Another way of looping
		for(String bird: birds) {
		  System.out.println(bird);
		}
	}
}


/* Output for the program: 
 
    Numbers are
	10
	20
	30
	40
	50
	Reversed order numbers are
	50
	40
	30
	20
	Birds in the array are:
	Sparrow
	Nightingale
	Parrots

*/
