package lydia.porter.ch7;
import java.util.*;
public class Ch7Project {
	
	Scanner input = new Scanner(System.in);
	
	public Ch7Project() {
		int userNum = 0;
		
		System.out.println("Enter a number: ");
		
		if (!input.hasNextInt()) { //if it's not an int
			System.out.println("Oops! Please enter an integer.");
			input.close();
			return;
		}
		
		userNum = input.nextInt();
		input.nextLine(); // clear remaining stream
		
		long factorial = 1;
		
		//calculate the factorial for loop
		for (long i=1; i<=userNum; i++)
		{
			factorial = factorial * i; 
		}
		System.out.println("for() loop results: " + factorial);
		
		factorial = 1; //resetting the factorial for the while loop
		
		long index = 1;
		while (index <= userNum) {
			 factorial = factorial * index;
			 index++; //increase by one
		 }
		System.out.println("while() loop result: " + factorial);
		factorial = 1;
		index = 1;
		do {
			factorial = factorial * index;
			index++;
		}
		
		 while (index <= userNum);
		 System.out.println("do-while() loop result: " + factorial);
		 
		 input.close();
	}
				
	public static void main(String[] args) {
		new Ch7Project();
	}
}
