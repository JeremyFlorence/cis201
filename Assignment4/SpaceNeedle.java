/*
      Name: Jeremy Florence
      Course: CIS - Computer Science I
      Section: 001
      Assignment: 4 (extra credit)
*/

public class SpaceNeedle {
   
   // Constant to determine the size of the figure.
   public static final int SIZE = 3;
  
   public static void main (String[] args) {
      upperSaucerHalf();
      lowerSaucerHalf();
      middleSection();
      upperSaucerHalf();
   }
   
   // prints a needle
   public static void needle() {
      for (int i = 1; i<= SIZE; i++) {
	  for (int j = 1; j <= 3 * SIZE; j++) {
	      System.out.print(" ");
      
	  }
      
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("|");
	  }
      
	  for (int j = 1; j <= 3 * SIZE; j++) {
	      System.out.print(" ");
	      
	  }
	  System.out.println();
      }
   }
   
   
   // Prints the upper part of the Saucer with a needle on top.
   public static void upperSaucerHalf() {
      needle();
      
      for (int i = 1; i <= SIZE; i++) {
	  
	  // Prints spaces based on i.
	  for (int j = 1; j <= -3 * i + 3 * SIZE; j++) {
	      System.out.print(" ");
	  }
	  
	  // Prints 2 underscores.
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("_");
	  }
	  
	  System.out.print("/");
	  
	  // Prints colons based on i.
	  for (int j = 1; j <= 3 * i - 3; j++) {
	      System.out.print(":");
	  }
	  
	  // Prints 2 underscores.
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("|");
	  }
	  
	  // Prints colons based on i.
	  for (int j = 1; j <= 3 * i - 3; j++) {
	      System.out.print(":");
	  } 
	  
	  System.out.print("\\");
	  
	  // Prints 2 underscores.
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("_");
	  }
	  System.out.println();
	  
      }
      
      System.out.print("|");
	  
	  // Prints a row of quotation marks based on the size
	  for (int j = 1; j <= SIZE * 6; j++) {
	      System.out.print("\"");
	  }
	  System.out.println("|");
     
   }
   
   // Prints the lower half of the saucer
   public static void lowerSaucerHalf() {
      for (int i = 1; i <= SIZE; i++) {
	  
	  // Prints spaces based on i.
	  for (int j = 1; j <= 2 * i -2; j++) {
	      System.out.print(" ");
	  }
	  System.out.print("\\_");
	  
	  // Prints spaces based on i.
	  for (int j = 1; j <= -2 * i + 3 * SIZE + 1; j++) {
	      System.out.print("/\\");  
	  }
	  System.out.print("_/");
	  System.out.println();
      }
   }
   
   // Prints the middle section
   
   public static void middleSection() {
      needle();
      for (int i = 1; i <= SIZE * 4; i++) {
	  for (int j = 1; j <= 3 * SIZE - 3; j++) {
	      System.out.print(" ");
	  }
	
	  System.out.print("|");
	  
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("%");
	  }
	  
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("|");
	  }
	  
	  for (int j = 1; j <= 2; j++) {
	      System.out.print("%");
	  }
	  System.out.println("|");
      }
   }
}
