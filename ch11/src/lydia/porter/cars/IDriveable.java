package lydia.porter.cars;

public interface IDriveable {
	//DEFINED METHODS IN INTERFACE
	//diff is keyword interface vs. class
	//class has to be defined out
	//needs to be able to do these following methods,
	//class
	
	public void speedUp(int setSpeed);
	public void slowDown(int setSpeed);
	public void turnLeft();
	public void turnRight();
	public void gearshift();
	public void startCar();
	
	
	
}

