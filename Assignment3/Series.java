/*
    Name: Jeremy Florence
    Course: CIS - Computer Science I
    Section: 001
    Assignment: 3
*/

public class Series {
    
    // Declares the constant N which represents 
    // the number of terms to calculate in the series.
    public static final int N = 10;
  
    public static void main(String[] args) {
	
	double term;
	double sum = 0;
	

	// Calculates the values of the series for the interval [1,N) 
	// and prints each term out, excluding the final term.
	
	for (int i = 1; i < N; i++) {
	    System.out.print("1/" + i + " + ");
	    term = 1.0 / i;
	    sum = sum + term;
	    
	}
	
	// Calculates the value of the final term.
	term = 1.0 / N;
	
	// Calculates the sum of all the terms,
	// prints the final term followed by the final sum
	sum = sum + term;
	System.out.println("1/" + N + " = " + sum);
    }
    
}
