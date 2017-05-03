/*
    Name: Jeremy Florence
    Course: CIS 201 - Computer Science I
    Section: 001
    Assignment: 8
*/

//This program takes a 7 digit ID entered by a user and
//determines whether the 7th digit is correct.
import java.util.Scanner;
public class CheckDigit {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your student ID (7 digits) : ");
	int id = input.nextInt();
	System.out.println("ID entered = " + id);
	int lastDigit = findLast(id);
	System.out.println("check digit calculated = " + lastDigit);
	System.out.println(checkLast(id,lastDigit));
	
    }
    
    //Calculates what the 7th digit SHOULD be.
    //Formula: (1*(1st) + 2*(2nd) + 3*(3rd)...6*(6th)) % 10
    public static int findLast(int id) {
	//Determines what the first digit is and immediately adds it into the
	//formula.
	int lastDigit = id/(int)(Math.pow(10,6));
	
	//Finds the remaining digits and multiplies them by i
	for (int i = 2; i <= 6; i++) {
	    lastDigit += i*(id / (int)(Math.pow(10,(-i+7))));
	}
	return lastDigit % 10;
    }
    
    //Determines whether the id the user entered is valid
    //based on whether their 7th digit is the same as the one calculated.
    public static String checkLast(int id,int lastDigit) {
	
	//If if the last digit of the id the USER entered is the same as
	//the one calculated, then it's a valid ID, otherwise it's invalid
	if ((id % 10) == lastDigit) {
	    return "Valid ID";
	} else {
	    return "Invalid ID";
	}
    }
}