/*
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 12
*/

//This program is a class to be used in client programs so that
//they can create fraction objects which can be changed and reduced.
public class Fraction {
    
    //fields
    int numerator;
    int denominator;
    
    //Constructor
    public Fraction (int n, int d) {
	numerator = n;
	denominator = d;
    }
    
    //Returns the fraction as a string
    public String toString() {
	return (numerator + "/" + denominator);
    }

    //allows the client to change the numerator
    public void setNumerator(int n) {
	numerator = n;
    }
    
    //allows the client to change the denominator
    public void setDenominator(int d) {
	denominator = d;
    }
    
    //helps the reduce method by finding a GCD
    private int gcd(int n, int d) {
	if (d == 0) {
	    return n;
	} else {
	    while (d != 0) {
		if (n > d) {
		    n = n - d;
		} else {
		    d = d - n;
		}
	    }
	}
	return n;
    }
    
    //reduces the fraction by dividing both the numerator and denominator
    //by the gcd
    public void reduce() {
	int gcd = gcd(numerator, denominator);
	numerator = numerator / gcd;
	denominator = denominator / gcd;
    }
    
    
  
}