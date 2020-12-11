package lydia.porter.checkerboard;

public class Checkerboard {
	
	public static void main(String[] args) {
		printCheckerboard(3,5);
		printCheckerboard(4,3);
		printCheckerboard(8,8);
	}
	
	public static void printCheckerboard(int numCols, int numRows) {
		for (int row = 0; row < numRows; row++) {
			//System.out.print("Row " + row + ' ');
			for (int col = 0; col < numCols; col++) {
				if(row%2 == 0) {
					//System.out.print("even ");
					if (col%2 == 0) {
						System.out.print("#");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else {
					//System.out.print("odd ");						
					if(col%2 == 0) {
						System.out.print(" ");
					}
					else {
						System.out.print("#");
					}
						
				}
			}
			//System.out.println("#");
			
			System.out.println();
		}
	
	}
		
	public Checkerboard() {
		// TODO Auto-generated constructor stub
	}

	

}
