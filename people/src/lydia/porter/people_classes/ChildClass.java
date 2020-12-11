package lydia.porter.people_classes;

public class ChildClass extends ParentClass{
		//has all the attributes from parent class
		//this class extends from parent class);
			
	public ChildClass() {
		this.setHairColor("black");
		//can we change it??????
		//YES!!!!!!! 
	}
	public void playInstrument() {
		System.out.println("music from above!");
	}
	public void goToSchool() {
		System.out.println("I'm at school");
	}
	
	
}
