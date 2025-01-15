import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GUI {
	private OrderHistory orderH;
  
	public void GUImakeOrder() throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));   //reader
		System.out.println("Enter Customer name : \n");
		String custName = rd.readLine();
		System.out.println("Enter Customer surname : \n");
		String custSurname = rd.readLine();
		
		Customer customer = new Customer(custName, custSurname);
		customer.MakeOrder();
		
		OrderManager ordMan = new OrderManager();
		ordMan.MakeOrder();
		
		
		System.out.println("Enter Restaurant name : \n");
		String restname = rd.readLine();
		Restaurant restaurant = new Restaurant(restname);
		
		System.out.println("Enter food name : \n");
		String foodname = rd.readLine();
		Food food = new Food(foodname, restaurant); 
		
		Order order = new Order(customer, food, restaurant);
		order.CreateOrder();
        this.orderH.AddOrderToHistory(order);
		
		System.out.println("\nEnter Yes if you want to rate your order\n");
		String decision = rd.readLine();
		
		if(decision.equalsIgnoreCase("Yes")) {
			System.out.println("You digited Yes so let's start to RATE the order\n");
			System.out.println("\nWrite your comment\n");
			String comment = rd.readLine();

            customer.AddRate(comment);
            OrderRating rate = new OrderRating(customer,comment,order);
            rate.CheckRate(customer,comment,order);
            
		} else {
			   System.out.println("You did NOT digit Yes, exiting app\n");
			 //  System.exit(0);
		}
		
	}
	
	public void run() throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));      //reader
		boolean alwaysTrue = true;
		while(alwaysTrue) {
			System.out.println("Digit M if you want to make an order\n");
			String decision = rd.readLine();
			
			if(decision.equalsIgnoreCase("M")) {
				System.out.println("You digited M so let's start to make the order\n");
			    this.GUImakeOrder();
			} else {
				   System.out.println("You did NOT digit M, exiting app\n");
				   System.exit(0);
			}
		}
	}
	
	public void sendOrderH(OrderHistory orderHistory) {
		   this.orderH=orderHistory;
	}
	
}
