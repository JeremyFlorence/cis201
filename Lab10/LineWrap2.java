import java.io.*;
import java.util.*;

public class LineWrap2 {

    public static void main (String [] args) throws FileNotFoundException {
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
        input = new Scanner(inFile);
	fileName += ".wrp";
	PrintStream output = new PrintStream(new File(fileName));
        lineWrap(input, output);
    }

    public static void lineWrap(Scanner sc, PrintStream output) {
        while (sc.hasNextLine()) {
	    String line = sc.nextLine();
            if (line.length() > 60) {
		output.println(line.substring(0,60));
                output.println(line.substring(60, line.length()));
	    } else
                output.println(line);
	}

    }
}
