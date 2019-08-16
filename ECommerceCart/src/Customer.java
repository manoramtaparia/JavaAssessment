
public class Customer {
	
	private int customer_id;
	private String password;
	
	public Customer(int cust_id, String password)
	{
		customer_id = cust_id;
		this.password = password;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
		
	}

