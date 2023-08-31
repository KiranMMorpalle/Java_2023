package Day28;

class Product{
	private String proName, proDesc;
	double proPrice;
	
	public Product(String proName, String proDesc, double proPrice) {
		super();
		this.proName = proName;
		this.proDesc = proDesc;
		this.proPrice = proPrice;
	}
	
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proDesc=" + proDesc + ", proPrice=" + proPrice + "]";
	}
	
	
}

public class ProductDetails {

	public static void main(String[] args) {

		Product objProduct=new Product("Samsung phone","4.5 inch",34000.0);
		System.out.println(objProduct.toString());

	}

}
