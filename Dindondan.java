
public class Dindondan {

	public static void main(String[] args) {

		Runnable cam1 = new Campana("din", 5);
		Thread t1 = new Thread(cam1);
		try {
		t1.start();
		t1.sleep(1000);
		}
		catch (InterruptedException e) {
			
			System.err.println("interrupted Exception.");
			
		}
		Thread t2 = new Thread(new Campana("don" , 5));
		try {
			t2.start();
			t2.sleep(500);
			}
			catch (InterruptedException e) {
				
				System.err.println("interrupted Exception.");
				
			}
		Thread t3 = new Thread( new Campana("dan", 5));
		try {
			t3.start();
			t3.sleep(2000);
			}
			catch (InterruptedException e) {
				
				System.err.println("interrupted Exception.");
				
			}
		
		
		
	}

}
