package blockspkg;

public class Animate implements Runnable {

	BlockBreaker blockPanel;
	
	public Animate(BlockBreaker b) { //pass in panel and assign to this object we made
		blockPanel = b;
	}
	
	@Override
	public void run() {
		while(true) {
			blockPanel.update();
			try {
				Thread.sleep(10); //run and update every 10 milliseconds
				//process everything in this ten millisecond sleep time
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
