/*
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 11
*/

//This program prompts the user to enter the name of a file and
//extracts ASCII codes, subtracts the number of ASCII codes from
//each code, and converts them into chars and prints them out which
//will reveal a secret message.

import java.util.*;
import java.io.*;

public class ExtractMessage {
    public static void main(String [] args)
				  throws FileNotFoundException {
	int [] codes = readFile();
	breakCode(codes);
    }
    
    //Prompts the user to enter a file and returns it once
    //they enter the name of a file that actually exists.
    public static File getFile() {
	Scanner userInput = new Scanner(System.in);
	File f;
	
	//prompts the user at least once and checks if the file exists.
	do {
	    System.out.print("Enter the name of the file you want to read: ");
	    f = new File(userInput.next());
	} while (!f.exists());
	return f;
    }
    
    //Goes through all the tokens in the file and extracts the ASCII
    //codes and puts them into an array.
    public static int [] readFile() throws FileNotFoundException {
	File f = getFile();
	Scanner fileInput = new Scanner(f);
	int count = 0;
	int [] codes = new int[200];
	
	//while the file has another token.
	while (fileInput.hasNext()) {
	    
	    //if the next token is an int, add it to the array
	    //and increment count. Otherwise skip over the token.
	    if (fileInput.hasNextInt()) {
		codes [count] = fileInput.nextInt();
		count++;
	    } else {
		fileInput.next();
	    }
	}
	return Arrays.copyOfRange(codes, 0, count);
    }
    
    //Converts the codes into chars and prints the secret message out.
    public static void breakCode(int [] codes) {
	System.out.print("The secret message is: ");
	
	//Subtracts the length of the array from each element of the array
	//and casts it into a char and prints it out.
	for (int i = 0; i < codes.length; i++) {
	    System.out.print((char)(codes[i] - (codes.length)));
	}
	System.out.println();
    }
}