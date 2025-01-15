
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Stub di metodo generato automaticamente
        
		OrderHistory orderH = new OrderHistory();        //create OrderHistory and initialize it with some orders
	    GUI gui = new GUI();
	    gui.sendOrderH(orderH);
	    gui.run();
	}	
	
}
