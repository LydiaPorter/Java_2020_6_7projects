package lydia.porter.chargeBattery;


public class SmartPhone {
   public static void main(String[] args) 
   {
      Battery myBattery = new Battery(0);
      myBattery.charge(10); //every time we do this it will add 10%!!!!!!
      myBattery.charge(10);
      myBattery.charge(10);
      myBattery.charge(10);
      System.out.println("Battery is " + myBattery.getPercentFull() + "% full!");
   }
   
   
   public SmartPhone() {
	   new SmartPhone();
   }
}

