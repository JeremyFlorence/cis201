/* 
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 5
*/

//This program draws a ruler with a size that is typed in by the user
//which can be up to 99 inches long.

import java.util.*;

public class Ruler {
    public static void main(String[] args) {
	System.out.print("How many inches long will the ruler be?");
	Scanner sc = new Scanner(System.in);
	int inches = sc.nextInt();
	drawRuler(inches);    
    }

    //Draws the entire ruler
    public static void drawRuler(int inches) {
	topPart(inches);
	middlePart(inches);
	bottomPart(inches);
    }
    
    //Prints the top part of the ruler
    public static void topPart(int inches) {
	System.out.print(" ");
	
	//Prints underscores
	for (int i = 1; i <= 4 * inches - 1; i++) {
	    System.out.print("_");
	}
	System.out.println("__");
    }
    
    //Prints the middle part of the ruler
    public static void middlePart(int inches) {
	
      //Prints a pipe and an apostrophe.
      for (int i = 1; i <= 2 * inches + 1; i++) {
	    System.out.print("|'");
	}
	System.out.println("|");
    }
    
    //Prints the bottom line of the ruler.
    public static void bottomPart(int inches) {
	System.out.print("|");
	
	//Prints the underscores and numbers.
	for (int i = 1; i <= inches; i++) {
	    System.out.print("__");
	    
	    //For the first 9 inches, an additional underscore will be printed.
	    for (int j = 1; j > i / 10; j--) {
		System.out.print("_");
	    }
	    
	    //Prints the inch numbers
	    System.out.print(i);
	    
	}
	System.out.println("_|");
    }
}