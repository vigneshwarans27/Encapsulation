package Encapsulation;

	class person{
		private String name;
		private int age;


		public String getname() {
			return name;
		}
		
		public void setname(String newname) {
			this.name = newname;
		}
		
		public int getage() {
			return age;
		}
		
		public void setage(int newage) {
			this.age = newage;
		}
	}	
public class per {

	public static void main(String[] args) {
		
		person p = new person();
		
		p.setname("Ajith");
		p.setage(30);
		
		System.out.println(p.getname());
		System.out.println(p.getage());
	}

}
