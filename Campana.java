
public class Campana implements Runnable{

	String suono;
	int volte;
	
	public Campana(String suono, int volte) {
		
		this.suono = suono;
		this.volte = volte;
		
	}
	
	public void run() {

		for (int i = 0; i < volte; i++) {
			
		
			try {	
				System.out.println((i + 1) + suono+ " ");
				Thread.sleep(2000);
				}
				catch (InterruptedException e) {
					
					System.err.println("interrupted Exception.");
					
				}
			
			
		}
		
	}
	
	

}
