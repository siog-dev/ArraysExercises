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
	public PrimeParser(int size) { // pass the size
		numbers = new int[size]; // Initialize the numbers
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
		// Create an instance of PrimeParser, passing in the size of args
		PrimeParser parser = new PrimeParser(args.length);
		
		int count = 0; // Track prime numbers

		for (int i = 0; i < args.length; i++) {
			// Convert String argument to integer
			int number = Integer.parseInt(args[i]);
			
			if (isPrime(number)) { // Check if the number is prime
				parser.numbers[count] = number;
				count++;
			}
		}
		// Output the prime numbers (up to 'count')
		for (int i = 0; i < count; i++) {
			System.out.println(parser.numbers[i] + " ");
		}
	}
	
}