package lydia.porter.chargeBattery;

public class Battery {
	private int charge;
	
	public Battery(int percentFull) {
		charge = percentFull;
	}
	
	public int getPercentFull() {
		System.out.println();
		return charge;
	}
	
	public void charge(int increase) {
		charge += increase;
	}

}
