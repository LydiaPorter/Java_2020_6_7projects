package blockspkg;

import javax.swing.JFrame;

public class Main {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Block Breaker");
		
		BlockBreaker panel = new BlockBreaker();
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //very important; close frame and stop java
		frame.setVisible(true);
		frame.setSize(500,600);
		//frame.setResizable(false);
		
		
		
		
	}

}
