import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch,i;
		List<Customer> cust = new ArrayList<Customer>();
		List<Product> prod = new ArrayList<Product>();
		while(true) {
		System.out.println("Enter your choice: 1)Add new customer\n2)Create a product\n3)Create an order\n4)View all orders\n5)Exit");
		ch=sc.nextInt();
		switch(ch) {
			case 1: 
				System.out.println("Enter your user ID and password");
				int cust_id = sc.nextInt();
				String pwd = sc.next();
				Customer c = new Customer(cust_id, pwd);
				cust.add(c);
				System.out.println("Successfully Registered!");
				break;
				
			case 2:
				System.out.println("Enter product name, product ID and price");
				String prod_name = sc.next();
				int prod_id = sc.nextInt();
				double price = sc.nextDouble();
				Product p = new Product(prod_name, prod_id, price);
				prod.add(p);
				System.out.println("Successfully created product!");
				break;
				
			case 3:
				System.out.println("Enter customer user_id");
				cust_id = sc.nextInt();
				System.out.println("The products we have are:");
//				Iterator<Product> itr = prod.iterator();
//				while(itr.hasNext()) {
//					System.out.println(itr.next());
//				}
				for(i=0;i<prod.size();i++) {
					System.out.println(prod.get(i));
				}
				break;
				
			case 4:
				System.out.println("Enter customer id to get all orders");
				int id = sc.nextInt();
				
				break;
				
			case 5:
				System.exit(0);
				
			default: System.out.println("Wrong choice");
		}
		}
	}

}