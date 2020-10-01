public class Fibonacci {
	
	/*	This program displays the Fibonacci Sequence up to values less than 10,000.
		Information about the sequence can be found here: https://brilliant.org/wiki/fibonacci-series/
		
		termVal is the value of a term, which should stay below 10,000.
	*/
	private static int termVal;
	private static final int MAX_TERM_VALUE = 10000;
	/*	I will be displaying the term's values one at a time, recursively. I will start it
		at term 0 and will continue to increase the term as long as the term's value is less than 10,000.
	*/
	public static void main(String[] args) {
		
		System.out.println("This program lists the Fibonacci Sequence.");
		Fibonacci fibonacci = new Fibonacci();
		int term = 0;
		while (fibonacci.sequence(term) < MAX_TERM_VALUE) {
			
			System.out.println(termVal);
			term++;
		}
	}
	/*	Here is the recursion method. I'm using recursion because I'm not storing the terms into an
		array (those have a fixed size and I don't know how many times the sequence will run).
		
		Information on recursion can be found here: https://www.w3schools.com/java/java_recursion.asp
	*/
	public int sequence(int count) {
		
		if (count == 0) return termVal = 0;		// Base case 1...
		else if(count == 1) return termVal = 1;	// Base case 2...
		else return termVal = sequence(count - 1) + sequence(count - 2);
	}
}