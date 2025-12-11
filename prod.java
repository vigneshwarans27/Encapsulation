package Encapsulation;

	class product{
		private int productid;
		private String productname;
		private double price;
		
		public int getproductid() {
			return productid;
		}
		
		public void setproductid(int newproductid) {
			this.productid = newproductid;
		}
		
		public String getproductname() {
			return productname;
		}
		
		public void setproductname(String newproductname) {
			this.productname = newproductname;
		}
		
		public double getprice() {
			return price;
		}
		
		public void setprice(double newprice) {
			this.price = newprice;
		}
	}

public class prod {

	public static void main(String[] args) {
		
		product p = new product();
		
		p.setproductid(1);
		p.setproductname("laptop");
		p.setprice(50000.0);
		
		System.out.println(p.getproductid());
		System.out.println(p.getproductname());
		System.out.println(p.getprice());
		

	}

}
