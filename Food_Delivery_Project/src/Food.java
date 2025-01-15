import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author angelo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Food {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String name;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String description;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private double price;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Restaurant restaurant;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Order order;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param name
	* @param description
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	
	private Random r = new Random();
	
	
	public String getFoodName() {
		return this.name;
	}
	
	public double getFoodPrice() {
		return this.price;
	}
	public Food(String name, Restaurant rest) {
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		this.name= name;
		this.price= tlr.nextInt(8, 25);
		this.restaurant=rest;
	}
	
	
	public void AddDescription(String name, String description) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param name
	* @param description
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void RemoveDescription(String name, String description) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param name
	* @param description
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void EditDescription(String name, String description) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param name
	* @param prince
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ChangePrice(String name, double prince) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param name
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ChangeName(String name) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}
}