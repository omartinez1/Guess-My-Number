package guess;
import java.util.Scanner;

class guess {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n = sc.nextInt();
	    while (n < 0) {
	    	System.out.print("Enter a positive integer for n: Enter a positive integer for n:");
	    	n = sc.nextInt();
	    }
	    if (n == 0) {
	    	n = sc.nextInt();
	    }
	    System.out.println("Welcome to Guess My Number!");
	    System.out.println("Please think of a number between 0 and "+ (n-1) +".");
	    int low = 0;
	    int high = n-1;
	    double calculations = (low + high)/2.0;
	    int guess = ((int) Math.ceil(calculations));
	    String result = "L";
	    while (result.equals("L") || result.equals("H") ) {
	    	System.out.println("Is your number: "+ guess +"?" );
	        System.out.println("Please enter C for correct, H for too high, or L for too low.");
	        System.out.print("Enter your response (H/L/C):");
	    	result = sc.next();
	    	 while ((result.equals("L") || result.equals("H") || result.equals("C")) == false) {
	    		 System.out.print("Enter your response (H/L/C):");
	    		 result = sc.next();
	    	    }
	    	if (result.equals("L")) {
	    		low = guess+1;
	    	}else if (result.equals("H")) {
	    		high = guess-1;
	    	}
	    	calculations = (low + high)/2.0;
	    	guess = ((int) Math.ceil(calculations));
	    }
	    System.out.println("Thank you for playing Guess My Number!");
	    sc.close();
	  }
	}