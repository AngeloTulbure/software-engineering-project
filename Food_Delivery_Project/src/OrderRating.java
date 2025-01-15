/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p>This is a documentation of the Document class.</p>
 * <!-- end-UML-doc -->
 * @author angelo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class OrderRating {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String comment;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Customer customer;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Order order;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param comment
	* @param order
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	
	public OrderRating(Customer customer,String comment,Order order) {
		this.comment=comment;
		this.customer=customer;
		this.order=order;
	}
	
	public void UpdateRate(String comment, Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
        
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param comment
	* @param order
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void CheckRate(Customer customer,String comment, Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
		System.out.println("This comment was written by : "+this.customer.getCustomerName()+"  "+this.customer.getCustomerSurName()+"\n");
		System.out.println("For the order : "+this.order.getOrderID()+"\n");
		System.out.println("Your comment : "+comment+"\n");
		
        if(comment.contains("bad words")) {
        	System.out.println("This comment contains bad words\n");
        	this.DenyRate();
        }
        	else {
        	System.out.println("This comment NOT contains bad words\n");
        	this.AcceptRate(comment, order);
        }
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param comment
	* @param order
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void AcceptRate(String comment, Order order) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
		System.out.println("You're comment was accepted because it was written properly\n");
		
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param comment
	* @param order
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void DenyRate() {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
		System.out.println("You're comment was denied because it contained bad words\n");
		// end-user-code
	}

	public Order getOrder() {
		// TODO Stub di metodo generato automaticamente
		return this.order;
	}
	
	public String getComment() {
		// TODO Stub di metodo generato automaticamente
		return this.comment;
	}
}