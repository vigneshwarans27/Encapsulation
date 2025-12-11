package Encapsulation;

	class sallary{
		private int id;
		private String name;
		private double sallary;
		
		public int getid() {
			return id;
		}
		
		public void setid(int newid) {
			this.id = newid;
		}
		
		public String getname() {
			return name;
		}
		
		public void setname(String newname) {
			this.name = newname;
		}
		
		public double getsallary() {
			return sallary;
		}
		
		public void setsallary(double newsallary) {
			if(sallary <= 10000) {
				this.sallary = newsallary;
			}else {
				System.out.println("error");
			}
		}
	}

public class sall {

	public static void main(String[] args) {
		sallary s = new sallary();
		
		s.setid(1);
		s.setname("naveen");
		s.setsallary(9500);
		
		System.out.println(s.getid());
		System.out.println(s.getname());
		System.out.println(s.getsallary());

	}

}
