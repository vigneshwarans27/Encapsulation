package Encapsulation;

	class phone{
		private String modelnumber;
		private double price;
		
		public String getmodelnumber() {
			return modelnumber;
			
		}
		
		public void setmodelnumber(String newmodelnumber) {
			this.modelnumber = newmodelnumber;
		}
		
		public double getprice() {
			return price;
		}
		
		public void  setprice(double newprice) {
			if(price >= 0) {
				this.price = newprice;
			}else {
				System.out.println("error");
			}
		}
	}

public class mobile {
	
	public static void main(String [] args) {
		
		phone p = new phone();
		
		p.setmodelnumber("Realme 6i");
		p.setprice(16000);
		
		System.out.println(p.getmodelnumber());
		System.out.println(p.getprice());
		
	}

}
