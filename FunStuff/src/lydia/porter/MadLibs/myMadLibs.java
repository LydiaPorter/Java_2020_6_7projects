package lydia.porter.MadLibs;
import java.util.*;

public class myMadLibs {
	Scanner input = new Scanner(System.in);

	public myMadLibs() {
		String myName;
		String friendName;
		String noun;
		String verb;
		String adj;
		String myInt;
		String dNum;
		String dayOrNight;
		//String firstInt;
		//String secInt;
		String place;
		String newAdj;
		String Adj;
		
		
		System.out.println("Welcome to Lydia's Mad Libs game!");
		System.out.println("Type your name and press enter: ");
		myName = input.nextLine();
		System.out.println("Type your friend's name and press enter: ");
		friendName = input.nextLine();
		System.out.println("Type a noun and press enter: ");
		noun = input.nextLine();
		System.out.println("Type a verb and press enter: ");
		verb = input.nextLine();
		System.out.println("Type an adjective and press enter: ");
		adj = input.nextLine();
		System.out.println("Type a whole number and press enter: ");
		myInt = input.nextLine();
		System.out.println("Type a decimal number and press enter: ");
		dNum = input.nextLine();
		System.out.println("Type morning, afternoon, or night and press enter: ");
		dayOrNight = input.nextLine();
		//System.out.println("Type a whole number and press enter: ");
		//firstInt = input.nextLine();
		//System.out.println("Type another whole number and press enter: ");
		//secInt = input.nextLine();
		System.out.println("Type a place and press enter: ");
		place = input.nextLine();
		System.out.println("Type an adjective and press enter: ");
		newAdj = input.nextLine();
		System.out.println("Type an adjective and press enter: ");
		Adj = input.nextLine();
		
		
		String story = "Once upon a time, " +myName; 
			story += " and " +friendName;
			story += " picked up a " +adj; 
			story += " " +noun;
			story += " on their way home from " +place; 
			story += " and decided to " +verb; 
			story += " it. ";
			story += "It was ";
			story += " in the " +dayOrNight;
			story += ". The " +noun;
			story += " cost $" +dNum;
			story += ". It was too " +Adj;
			story += "! They decided it was a " +adj;
			story += " idea!";
		
		
		System.out.println(story);
	}

	public static void main(String[] args) {
		new myMadLibs();

	}

}
