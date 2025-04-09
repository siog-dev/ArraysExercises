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
	
	//METHOD TO CHECK FOR PRIME NUMBERS
	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false; // 0 and 1 are not prime
		}
		
		// Loop from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false; // If divisible by any number, it's not prime
			}
		}
		
		return true; // If no factors found, it's prime
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			
		}
	}
	
}