package people.start;

import lydia.porter.people_classes.*;
// .* means import all classes in package

public class MainEntry {

	public MainEntry() {
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass(); 
		System.out.println(child.getHairColor());
		System.out.println(child.getEyeColor());
		System.out.println(child.getEthnicity());
		child.speak("Hello!");
		//pass in message
		parent.speak("Why hello there, Child.");
		child.playInstrument();
		//parent.playInstrument(); will NOT work because the parent can't do it
		//child.hairColor();
		
		//we need to create methods called getters and setters to maintain encapsulation
		// of your program
		
	}

	public static void main(String[] args) {
		new MainEntry();

	}

}
