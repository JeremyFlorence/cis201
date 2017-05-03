/*
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 2
*/

// This program prints out the text "GIGGLING FLIBBERTIGIBBET" in vertical block letters using multiple methods to organize redundant tasks.

public class Flib {

    public static void main(String [] args) {
	giggling();
	wordSpace();
	flibbertigibbet();
	
	
    }
    
    // The following methods will print out the completed words
    public static void giggling() {
	letterG();
	letterI();
	letterG();
	letterG();
	letterL();
	letterI();
	letterN();
	letterG();
    }
    
    public static void flibbertigibbet() {
	letterF();
	letterL();
	letterI();
	letterB();
	letterB();
	letterE();
	letterR();
	letterT();
	letterI();
	letterG();
	letterI();
	letterB();
	letterB();
	letterE();
	letterT();
    }
    
    // The following methods will draw out the completed letters.
    
    // Draws the letter "B"
    public static void letterB() {
	rowOfFour();
	twoColumns();
	rowOfFour();
	twoColumns();
	twoColumns();
	rowOfFour();
	letterSpace();
    }

    // Draws the letter "E"
    public static void letterE() {
	rowOfFive();
	oneColumnLeft();
	rowOfFour();
	oneColumnLeft();
	oneColumnLeft();
	rowOfFive();
	letterSpace();
    }

    // Draws the letter "F"
    public static void letterF() {
	rowOfFive();
	oneColumnLeft();
	rowOfFour();
	oneColumnLeft();
	oneColumnLeft();
	oneColumnLeft();
	letterSpace();
    }

    // Draws the letter "G"
    public static void letterG() {
	rowOfFour();
	twoColumns();
	oneColumnLeft();
	System.out.println("$  $$");
	twoColumns();
	rowOfFour();
	letterSpace();
    }

    // Draws the letter "I"
    public static void letterI() {
	rowOfFive();
	oneColumnCenter();
	oneColumnCenter();
	oneColumnCenter();
	oneColumnCenter();
	rowOfFive();
	letterSpace();
    }

    // Draws the letter "L"
    public static void letterL() {
	oneColumnLeft();
	oneColumnLeft();
	oneColumnLeft();
	oneColumnLeft();
	oneColumnLeft();
	rowOfFive();
	letterSpace();
    }

    // Draws the letter "N"
    public static void letterN() {
	System.out.println("$    $");
	System.out.println("$$   $");
	System.out.println("$ $  $");
	System.out.println("$  $ $");
	System.out.println("$   $$");
	System.out.println("$    $");
	letterSpace();
    }

    // Draws the letter "R"
    public static void letterR() {
	rowOfFour();
	twoColumns();
	rowOfFour();
	twoColumns();
	twoColumns();
	twoColumns();
	letterSpace();
    }

    // Draws the letter "T"
    public static void letterT() {
	rowOfFive();
	oneColumnCenter();
	oneColumnCenter();
	oneColumnCenter();
	oneColumnCenter();
	oneColumnCenter();
	letterSpace();
    }

    // The following methods will draw out any redundant parts of the letters
    
    // Draws a row four characters wide
    public static void rowOfFour() {
	System.out.println("$$$$");
    }

    // Draws a row five characters wide
    public static void rowOfFive() {
	System.out.println("$$$$$");
    }

    // Draws one character on the left
    public static void oneColumnLeft() {
	System.out.println("$");
    }

    //Draws one character in the center
    public static void oneColumnCenter() {
	System.out.println("  $  ");
    }
	  

    // Draws 2 characters 3 spaces apart
    public static void twoColumns() {
	System.out.println("$   $");
    }

    //Makes a single line of space
    public static void letterSpace() {
	System.out.println();
    }
    
    //Makes 4 lines of space
    public static void wordSpace() {
	letterSpace();
	letterSpace();
	letterSpace();
    }    
}
    
    
    

    