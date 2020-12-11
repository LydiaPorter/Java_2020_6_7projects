package lydia.porter.chargeBattery;

public class test {
	
	private int a = 0;
	
	double mystery(int a, double b)
	{
	    return this.a * b;
	}

	public static void  main(String[] args) {
	int a = 3;

	double b = 2.0;
    test t = new test();
	System.out.println(t.mystery(a, b));
	}

}
