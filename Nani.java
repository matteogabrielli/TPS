
public class Nani extends Thread {

	public Nani (String nome) {
		
		setName(nome);
		
	}
	
	public void run() {
		
		System.out.println(getName());
		
	}

}
