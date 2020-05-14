
public class ProvaNani {
	
   public static void main(String[] args) {
	   
	   Thread t1 = new Nani("brontolo");
	   Thread t2 = new Nani("eolo");
	   Thread t3 = new Nani("pisolo");
	   Thread t4 = new Nani("mammolo");
	   Thread t5 = new Nani("dotto");
	   Thread t6 = new Nani("cucciolo");
	   Thread t7 = new Nani("gongolo");
	   
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
	   t5.start();
	   t6.start();
	   t7.start();
	   
   }

}
