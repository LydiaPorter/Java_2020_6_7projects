package lydia.porter.cars;

public class Car implements IDriveable, ISafety, IEntertainment { //"implements" adds the interfaces
	public String color;
	public String make;
	public String model;
	public int volume;
	public boolean belt;
	public int speed;
	public int tireAngle;
	
	public Car() {
		volume = 0;
		belt = false;
		speed = 0;
	}

	//ADDED UNIMPLEMENTED METHODS
	//inherited all these methods
	//if we ddidnt' override, we would inherit
	//override what it said and define it all by itself here?
	@Override
	public void radioVolume() {
		volume ++;
		
	}

	@Override
	public void seatbelt() {
		if (belt == true) {
			belt = false;
		}
		else {
			belt = true;
		}
		
	}

	@Override
	public void speedUp(int setSpeed) {
		if (setSpeed >= speed) {
			speed = setSpeed;
		} 
		else {
			return;
		}	
		speed = setSpeed;
		
	}
	@Override
	public void slowDown(int setSpeed) {
		if (setSpeed <= speed) {
			speed = setSpeed;
		} 
		else {
			return;
		}
		speed = setSpeed;
		
	}

	@Override
	public void turnLeft() {
		if(tireAngle>= -22) {
		tireAngle --;
		
	}
		else {
			return;
		}
	}
	@Override
	public void turnRight() {
		if (tireAngle <= 22) {
			tireAngle ++;
		}
		else {
			return;
		}
		
	}

	@Override
	public void radioTuner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blinker() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gearshift() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		
	}

}
