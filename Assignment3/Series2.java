public class Series2 {
    
    // Declares the constant N which represents 
    // the number of terms to calculate in the series.
    public static final int N = 10;
  
    public static void main(String[] args) {
	double sum = 0;
	System.out.println("Iterative Result:");
	printSum1(sum);
	System.out.println();
	System.out.println("Recursive Result:");
	printSum2(1, sum);

	
	
	
    }
    
    //Iterative Method
    public static void printSum1(double sum) {
	for (int i = 1; i < N; i++) {
	    System.out.print("1/" + i + " + ");
	    sum += 1.0 / i;
	    
	}
	sum += 1.0 / N;
	System.out.println("1/" + N + " = " + sum);
    }
    
    //Recursive Method
    public static void printSum2(int i, double sum) {
	if (i == N) {
	    sum += 1.0 / N;
	    System.out.println("1/" + N + " = " + sum);
	} else {
	    sum += 1.0 / i;
	    System.out.print("1/" + i + " + ");
	    printSum2(i+1, sum);
	}
    }
    
    
    
}