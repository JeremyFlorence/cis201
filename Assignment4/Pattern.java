/*
      Name: Jeremy Florence
      Course: CIS - Computer Science I
      Section: 001
      Assignment: 4
*/



public class Pattern {
    // Constant to control the size of the entire pattern.
    public static final int HEIGHT = 3;

    public static void main(String[] args) {
	line();
	top();
	line();
	bottom();
	line();
    }
    
    // Prints the entire top part of the pattern excluding the lines.
    public static void top() {
	firstPart();
	secondPart();
    }
    
    // Prints the entire bottom part of the pattern excluding the lines.
    public static void bottom() {
	secondPart();
	firstPart();
    }
    
    // Prints an upward pointing triangular figure.
    public static void firstPart() {
	// Controls the amount of rows to be printed.
	for (int i = 1; i <= HEIGHT; i++) {
	    System.out.print("|");
	    // Prints spaces based on the current row.
	    for (int j = 1; j <= -i + HEIGHT; j++) {
		System.out.print(" ");
		
	    }
	    
	    // Prints forward slashes based on the current row.
	    for (int j = 1; j <= i - 1; j++) {
		System.out.print("/");
	    }
	    
	   
	    
	    System.out.print("*");
	    
	    // Prints back slashes based on the current row.
	    for (int j = 1; j <= i - 1; j++) {
		System.out.print("\\");
	    }
	    
	    // Prints spaces based on the current row.
	    for (int j = 1; j <= -i + HEIGHT; j++) {
		System.out.print(" ");
		
	    }
	    System.out.println("|");
	}
    }
    
    // Prints a downward pointing triangular figure.
    public static void secondPart() {
	// Controls the amount of rows to be printed.
	for (int i = 1; i <= HEIGHT; i++) {
	    System.out.print("|");
	    
	    // Prints spaces based on the current row.
	    for (int j = 1; j <= i - 1; j++) {
		System.out.print(" ");
		
	    }
	    
	    // Prints back slashes based on the current row.
	    for (int j = 1; j <= -i + HEIGHT; j++) {
		System.out.print("\\");
	    }
	    
	    System.out.print("*");
	    
	    // Prints forward slashes based on the current row.
	    for (int j = 1; j <= -i + HEIGHT; j++) {
		System.out.print("/");
	    }
	    
	    // Prints spaces based on the current row.
	    for (int j = 1; j <= i - 1; j++) {
		System.out.print(" ");
		
	    }
	    System.out.println("|");
	}
    }
    
    // Prints a line starting and ending with
    // addition signs with dashes in between.
    public static void line() {
	System.out.print("+");
	for (int i = 1; i <= 2 * HEIGHT - 1; i++) {
	   System.out.print("-");
	}
	System.out.println("+");
    }



}