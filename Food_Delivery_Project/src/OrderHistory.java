
/**
 * 
 */

import java.util.HashSet;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author angelo
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class OrderHistory {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Order> orders;      //set of all the orders

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param order
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
    
	public void initialize() {
	Order order1 = new Order("Ale","Do","pasta alla bolognese","Late Night Dine",18495);
	Order order2 = new Order("Bea","Green","lasagna","Chops & Hops",28419);
	Order order3 = new Order("Kate","Black","kebab","Taste Elements",78453);
	Order order4 = new Order("John","Brown","burger","Food Island",85461);
	Order order5 = new Order("Mary","Reddinton","hot dog","Epic Dining",84883);
			
	orders.add(order1); 
	orders.add(order2); 
	orders.add(order3); 
	orders.add(order4); 
	orders.add(order5); 
	}
	
	public OrderHistory() {
		this.orders = new HashSet<Order>();
		initialize();
	}
	
	
	public void AddOrderToHistory(Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
        Integer prev_size = orders.size();;
        
        orders.add(order);
        Integer after_size = orders.size();
        
        if(prev_size >= after_size) {
        	System.out.println("The order was NOT added to the OrderHistory\n");
        } else {
        	System.out.println("The order was added to the OrderHistory\n");
        	System.out.println("Total number of orders in the OrderHistory : "+orders.size()+"\n");
        	this.UpdateOrderHistory(order);
        }
	}
		// end-user-code


	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param order
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void RemoveOrderFromHistory(Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param order
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void UpdateOrderHistory(Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
      //  orders.add(order);
        System.out.println("The OrderHistory was updated correctly with the orderID = "+order.getOrderID()+"\n");
		// end-user-code
	}
}