package Encapsulation;

	class student{
		private int rollnumber;
		private String name;
		private double marks;
		
		public int getrollnumber() {
			return rollnumber;
		}
		
		public void setrollnumber(int newrollnumber) {
			this.rollnumber = newrollnumber;
		}
		
		public String getname() {
			return name;
		}
		
		public void setname(String newname) {
			this.name = newname;
		}
		
		public double getmarks() {
			return marks;
		}
		
		public void setmarks(double newmarks) {
			if(marks >= 0 && marks <=100) {
				this.marks = newmarks;
			}else {
				System.out.println("error");
			}
		}
		
		 Boolean ispassed () {
			return marks > 40;
		}
	}

public class std {

	public static void main(String[] args) {
		student s = new student();
		
		s.setrollnumber(7);
		s.setname("vicky");
		s.setmarks(90.8);
		
		System.out.println(s.getrollnumber());
		System.out.println(s.getname());
		System.out.println(s.getmarks());

	}

}
