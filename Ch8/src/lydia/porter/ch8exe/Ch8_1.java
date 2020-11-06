package lydia.porter.ch8exe;

import java.util.Scanner;
import lydia.porter.ch8exe.Test.*;

public class Ch8_1 {
	
	
	public Ch8_1() { //constructor
		print("hello");
		print(1);
		print(3.14);
		print(true);
		Scanner input = new Scanner(System.in);
		String x = input("will this work?");
		print(x);
		String y = input("testing a number input");
		print(y);
		print(Test.test);
	}
	
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		System.out.println(question);
		String x = input.next();
		input.close();
		return x;
		
	}
	
	public static void main(String[] args) { //execution method, method call
		new Ch8_1();
		//when you put this in, it will run everything in the constructor {} from above
	}
	

	public static void steve() {
		System.out.println("my name is steve");
	}

	
	public static void print(Object x) { //bc it's an object, it can do any data type
		System.out.println(x);
	}
	
}
