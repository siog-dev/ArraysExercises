package ie.atu.sw;

/*
 * Write a program called PrimeParser that reads in 
 * a set of numbers into the String[] args array of main() 
 * and then converts them to an integer array. The integer 
 * array should discard any number that is not prime. 
 * A number is prime if its only divisors are itself and 1. 
 * One (naive, but okay for this exercise) way to test if a 
 * number is prime is to check if every integer between 1 and 
 * itself (exclusive) divides evenly.
 */

public class PrimeParser {
	
	//INSTANCE VARIABLES
	private int[] numbers = null;
	
	//CONSTRUCTOR
	public PrimeParser(int size) {
		numbers = new int[size];
	}
	
	public static void main(String[] args) {
		
	}
	
}