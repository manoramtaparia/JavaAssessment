public class Product {

	private String prodName;
	private int prodId;
	private double price;
	
	public Product(String prodName, int prodId, double price) {
		this.prodName = prodName;
		this.prodId = prodId;
		this.price = price;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prod_name) {
		this.prodName = prod_name;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prod_id) {
		this.prodId = prod_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
