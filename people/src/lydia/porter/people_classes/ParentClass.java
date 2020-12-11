package lydia.porter.people_classes;

import java.util.Scanner;

public class ParentClass {
	//parents and children have all of these attributes
	//but not every person is the same
	//some change
	private String hairColor = "brown";
	private int age;
	private String gender;
	private String eyeColor = "blue";
	private int weight;
	private double height;
	private String ethnicity = "white";
	
	//declared them here, but
	//define in object
	//define a child but don't have to be as descriptive to make it work.
	
	//must declare them public here to access them elsewhere
	//private means can only access them in this class
	//unless given special permission
	//OOP so code doesn't get unexpected changes
	
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getHairColor() {
		return hairColor;
	}
	//it's a getter cause it says get |
	//when i call this it will return whatever's in the hairColor method

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	//to change hairColor, use the setter (this one)
	//pass in a hair color and will make it equal what we put in
	//we changed hair color in child class

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//create manual getter for ethnicity
	public String getEthnicity() {
		String password = "123456";
		String my_password = "";
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("enter the password");
			my_password = input.nextLine();
		}
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}
		if (my_password.equals(password)) {
			return ethnicity;
		}
		else {
			System.out.println("Something went wrong.");
		}
		}
	
	
	
	

	public void speak(String message) {
		System.out.println(message);
	}
	public void run() {
		System.out.println("running");
	}
	public void jump() {
		System.out.println("jumping");
	}
	
	
	
	
	
	
	
	
	
	

}
