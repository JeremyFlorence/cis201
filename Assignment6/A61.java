 /**
   *  Name: Jeremy Florence
   *  Course: CIS 201 - Computer Science I
   *  Section: 001
   *  Assignment: 6.1
   */

import java.util.*;

// This program accepts two integers as input
// and 

public class A61 {

    public static void main (String [] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
	int rows = input.nextInt();
	int cols = input.nextInt();
	printGrid(rows, cols);
    }

    // write printGrid() here
    public static void printGrid(int rows, int cols) {
	for(int i = 1; i<= rows; i++) {
	    for(int j = 1; j<= cols; j++) {
		System.out.print((j*rows - rows) + i + " ");
	    }
	    System.out.println();
	}
    }
}
