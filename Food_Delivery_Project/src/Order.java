
/**
 * 
 */

import java.util.Random;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author angelo
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Order {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Deliveryman deliveryman;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int quantity;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private double tip;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer orderID;
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
	private OrderManager orderManager;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<OrderRating> orderRating;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private OrderHistory orderhistory;
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
	private Food food;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @param quantity
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Random r = new Random();
	
	public Integer getOrderID() {
		return this.orderID;
	}


	public Order(Customer customer, Food food, Restaurant restaurant) {
	      this.orderID= r.nextInt(100000);
	      this.customer = customer;
	      this.food = food;
	      this.restaurant = restaurant;
	}

	public void CreateOrder() {
		System.out.println("This is the CreateOrder operation in Order Class\n");
		System.out.println("Your complete order is the following : \n");
		System.out.println("Customer Name : "+this.customer.getCustomerName()+"\n");
		System.out.println("Customer SurName : "+this.customer.getCustomerSurName()+"\n");
		System.out.println("OrderID : "+this.getOrderID()+"\n");
		System.out.println("Restaurant chosen : "+this.restaurant.getRestaurantName()+"\n");
		System.out.println("Food chosen : "+this.food.getFoodName()+"\n");
		System.out.println("Food price : "+this.food.getFoodPrice()+" $\n");
		}

	
	// I use this operation just to make the creation of Orders that will be added to the OrderHistory easier
	public Order(String custName, String custSurname, String food, String rest, Integer orderID) {
		this.orderID = orderID;
		this.customer = new Customer(custName,custSurname);
		this.restaurant = new Restaurant(rest);
		this.food = new Food(food,this.restaurant);
	}
	

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param restaurant
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ChooseRestaurant(Restaurant restaurant) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}
	

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void FinishOrder(int orderID) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String NotifyUnsuccessfulOrder(int orderID) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void AddOrderToSchedule(int orderID) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @param check
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void CheckOrderID(int orderID, String check) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void PrintErrorMessage(int orderID) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void CheckAvailability(Food food) {
		short rtg_state = state;
		switch (rtg_state) {
		case 7:
			state = 5;
			return;
		default:
			return;
		}
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param orderID
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ScheduleOrder(String orderID) {
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tip
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void AddTip(double tip) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void AddFood(Food food) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @param quantity
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ChangeFoodQuantity(Food food, int quantity) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void RemoveFood(Food food) {
		// begin-user-code
		// TODO Stub di metodo generato automaticamente

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void order() {
	}

	/** 
	* @generated "com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension (com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension)"
	*/
	private short state = 2;

	/** 
	* @generated "com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension (com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension)"
	*/
	private void rtg_init1() {
		state = 2;
	}

	/** 
	* @generated "com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension (com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension)"
	*/
	private void rtg_init4() {
		state = 7;
	}

	/** 
	* @generated "com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension (com.ibm.xtools.transform.uml2.java.sm.PassiveClassStatemachineExtension)"
	*/
	private void rtg_init11() {
		state = 13;
	}
}