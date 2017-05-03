/*
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 10
*/

import java.io.*;
import java.util.*;

//This program searches for a name entered by the user
//in a file called "names.txt" and collects and prints out
//data representing the popularity of names within a certain decade.
public class BabyNames {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner fileInput = new Scanner(new File("names.txt"));
	String name = getName();
	String line = getDataLine(name, fileInput);
	
	//If no line of data is returned it means the name wasn't found,
	//so print out that the name wasn't found. Otherwise print out
	//the stats for that name.
	if(line.equals("")) {
	    System.out.println("\"" + name + "\" not found.");
	} else {
	    display(line);
	}
    }
    
    //Prompts the user to enter a name and then returns it and stores it
    //as a string in the main method.
    public static String getName() {
	Scanner userInput = new Scanner(System.in);
	System.out.println("This program graphs the popularity of a name\n"
			    + "in Social Security baby name statistics\n"
			    + "recorded since the year 1900.");
	System.out.print("Type a name: ");
	return userInput.next();
    }
    
    //Searches for the name in the file and returns the line of data
    //associated with it if it is found, otherwise it returns an
    //empty string.
    public static String getDataLine(String name, Scanner fileInput) {
	
	String fileName = "";
	
	//While there is another line, scan the line for the name that was
	//entered and if it is found, return that line.
	while(fileInput.hasNextLine()) {
	    Scanner lineScanner = new Scanner(fileInput.nextLine());
	    fileName = lineScanner.next();
	    if (fileName.equalsIgnoreCase(name)) {
		return fileName + lineScanner.nextLine();
	    }
	}
	return "";
    }
    
    //Prints the data for the name in the correct format.
    public static void display(String line) {
	Scanner readLine = new Scanner(line);
	int year = 1900;
	System.out.println("Statistics on name \"" + readLine.next() + "\"");
	
	//Prints the popularity of the name for each decade between 1900 and
	//2000.
	for(int i = 1; i <= 11; i++) {
	    System.out.println(year + ": " + readLine.next());
	    year += 10;
	}
    }
}