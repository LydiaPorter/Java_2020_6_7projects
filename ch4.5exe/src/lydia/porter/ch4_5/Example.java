package lydia.porter.ch4_5;
import java.util.*;

public class Example {

	public Example() {
		Scanner input = new Scanner(System.in);
		System.out.println("type something in");
		String word1 = input.nextLine(); //grabs next line of text that comes in
		String word2 = input.nextLine();
		String word3 = input.nextLine();
		String word4 = input.nextLine();
		String word5 = input.nextLine();
		
		//String.format("The input format parameter", "Object parameter");
		
			//precision: how many decimal points?
			// %[parameter_index$][flags][width]
			//%s

		String result = String.format("Three %(d blind mice %2$tr", -2856935, Calendar.getInstance( )); 
		System.out.println(result);
		
		//System.out.print("enter in a word");
		//String word1 -input.nextLine();
	
		String myText = String.format("Turmoil has engulfed the\n"
				+ " %1$s Republic. The taxation\n"
				+ "of trade routes to outlying star\n"
				+ "systems is in dispute.\n"
				+ "\n"
				+ "Hoping to resolve the matter\n"
				+ "with a blockade of %2$s \n"
				+ "battleships, the greedy Trade\n"
				+ "Federation has stopped all\n"
				+ "shipping to the small planet\n"
				+ "of %3$s.\n"
				+ "\n"
				+ "While the Congress of the\n"
				+ "Republic endlessly debates\n"
				+ "this %4$s chain of events,\n"
				+ "the Supreme Chancellor has\n"
				+ "secretly dispatched two %5$s \n"
				+ "Knights, the guardians of\n"
				+ "peace and justice in the\n"
				+ "galaxy, to settle the conflict....", word1, word2, word3, word4, word5);
		System.out.println(myText);
		
		input.close(); 
		
	}

	public static void main(String[] args) {
		new Example(); 

	}

}
