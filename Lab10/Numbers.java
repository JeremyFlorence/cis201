import java.io.*;
import java.util.*;

public class Numbers {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = openFile();// what should you do here, look at the method
                        // openFile() below
	double max = 0;
	double min = 0;
	double sum = 0;
	int count = 0;
	while (input.hasNext()) {
	    if (!input.hasNextDouble()) {
		input.next();
		continue;
	    }
	    double number = input.nextDouble();
	    if (number > max) {
		max = number;
		
	    } else if (number < min) {
		min = number;
	    }
	    sum+= number;
	    count++;
	}
	// finish program here

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/count));

    }

    public static Scanner openFile() throws FileNotFoundException {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        File inFile = new File(fileName);
        while (!inFile.exists()) {
           System.out.println(fileName + " not found.");
           System.out.print("Enter file name: ");           
           fileName = input.nextLine();
           inFile = new File(fileName);
	}
        return new Scanner(inFile);
    }

}
